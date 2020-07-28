package com.example.sanitas.services.impl;

import org.springframework.stereotype.Service;

import com.example.sanitas.dto.CalculadoraDTO;
import com.example.sanitas.services.CalculadoraServices;

import io.corp.calculator.TracerImpl;

@Service
public class CalculadoraServicesImpl implements CalculadoraServices {
	
	public CalculadoraServicesImpl() {
		super();
	}
	
	@Override
	public Double calcular(CalculadoraDTO calculo) {
		Double resultado = null;
		TracerImpl t = new TracerImpl();
		if (comprobarParametros(calculo)) {
			t.trace(calculo.getOperador1().toString().concat(" ").concat(calculo.getOperacion()).concat(" ")
					.concat(calculo.getOperador2().toString()));
			switch (calculo.getOperacion()) {
			case "+":
				resultado = calculo.getOperador1() + calculo.getOperador2();
				break;

			case "-":
				resultado = calculo.getOperador1() - calculo.getOperador2();
				break;
			default:
				break;
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
