package com.example.sanitas.service.impl;

import org.springframework.stereotype.Service;

import com.example.sanitas.dto.CalculadoraDTO;
import com.example.sanitas.service.CalculadoraService;

import io.corp.calculator.TracerImpl;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	public CalculadoraServiceImpl() {
		super();
	}

	private Double resultado = null;

	@Override
	public Double calcular(CalculadoraDTO calculo) {
		TracerImpl t = new TracerImpl();
		if (comprobarParametros(calculo)) {
			t.trace(calculo.getOperador1().toString().concat(" ").concat(calculo.getOperacion()).concat(" ")
					.concat(calculo.getOperador2().toString()));
			if (("+").equals(calculo.getOperacion())) {
				resultado = calculo.getOperador1() + calculo.getOperador2();
			} else if (("-").equals(calculo.getOperacion())) {
				resultado = calculo.getOperador1() - calculo.getOperador2();
			}
		}
		t.trace(resultado);
		return resultado;
	}

	private boolean comprobarParametros(CalculadoraDTO calculo) {
		return calculo != null && calculo.getOperacion() != null && calculo.getOperador1() != null
				&& calculo.getOperador2() != null;
	}

}
