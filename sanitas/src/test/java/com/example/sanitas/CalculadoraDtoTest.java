package com.example.sanitas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sanitas.dto.CalculadoraDTO;


public class CalculadoraDtoTest {

	private final CalculadoraDTO calculadoraDto = new CalculadoraDTO();

	@BeforeEach
	void setUp() throws Exception {
		calculadoraDto.setOperacion("+");
		calculadoraDto.setOperador1(new Double(1));
		calculadoraDto.setOperador2(new Double(2));
	}

	@Test
	void testGetOperador1() {
		assertEquals(new Double(1), calculadoraDto.getOperador1());
	}

	@Test
	void testSetOperador1() {
		calculadoraDto.setOperador1(new Double(2));
		assertEquals(new Double(2), calculadoraDto.getOperador1());
	}

	@Test
	void testGetOperador2() {
		assertEquals(new Double(2), calculadoraDto.getOperador2());
	}

	@Test
	void testSetOperador2() {
		calculadoraDto.setOperador2(new Double(3));
		assertEquals(new Double(3), calculadoraDto.getOperador2());
	}

	@Test
	void testGetOperacion() {
		assertEquals("+", calculadoraDto.getOperacion());
	}

	@Test
	void testSetOperacion() {
		calculadoraDto.setOperacion("-");
		assertEquals("-", calculadoraDto.getOperacion());
	}

}
