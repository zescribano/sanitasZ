package com.example.sanitas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.sanitas.dto.CalculadoraDTO;
import com.example.sanitas.service.CalculadoraService;
import com.example.sanitas.service.impl.CalculadoraServiceImpl;

public class CalculadoraServiceTest {

	@Autowired
	private CalculadoraService calculadoraService;

	private CalculadoraDTO calculadoraDto;

	@BeforeEach
	void setUp() throws Exception {
		calculadoraService = new CalculadoraServiceImpl();
		calculadoraDto = new CalculadoraDTO();
		calculadoraDto.setOperador1(new Double(2));
		calculadoraDto.setOperador2(new Double(2));
	}

	@Test
	void calcularSumaTest() {
		calculadoraDto.setOperacion("+");
		assertEquals(new Double(4), calculadoraService.calcular(calculadoraDto));
	}

	@Test
	void calcularRestaTest() {
		calculadoraDto.setOperacion("-");
		assertEquals(new Double(0), calculadoraService.calcular(calculadoraDto));
	}
	@Test
	void calcularNullTest() {
		calculadoraDto.setOperacion(null);
		assertEquals(null, calculadoraService.calcular(calculadoraDto));
	}

}
