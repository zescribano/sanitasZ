package com.example.sanitas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sanitas.dto.CalculadoraDTO;
import com.example.sanitas.service.CalculadoraService;

@Controller
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping(value = { "/calculadora" })
	public Double calcular(CalculadoraDTO calculo) {
		return calculadoraService.calcular(calculo);
	}
}
