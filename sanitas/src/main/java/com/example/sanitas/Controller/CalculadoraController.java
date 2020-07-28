package com.example.sanitas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sanitas.dto.CalculadoraDTO;
import com.example.sanitas.services.CalculadoraServices;

@Controller
public class CalculadoraController {
	
	@Autowired
	CalculadoraServices calculadoraServices;

	@GetMapping(value = { "/calculadora" })
	public Double calcular(CalculadoraDTO calculo) {
		return calculadoraServices.calcular(calculo);
	}
}
