package com.example.sanitas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.sanitas.Controller.CalculadoraController;
import com.example.sanitas.dto.CalculadoraDTO;

class calculadoraTest {

	CalculadoraController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		ApplicationContext cts = SpringApplication.run(SanitasApplication.class);
		controller = cts.getBean(CalculadoraController.class);
		SpringApplication.exit(cts, new ExitCodeGenerator() {
			
			@Override
			public int getExitCode() {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
	@Test
	 void testSumaOK() {
	  CalculadoraDTO dto = new CalculadoraDTO();
	  
	  dto.setOperacion("+");
	  dto.setOperador1(new Double(10));
	  dto.setOperador2(new Double(10));
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, new Double(20));
	 }
	 
	 @Test
	 void testRestaOK() {
	  CalculadoraDTO dto = new CalculadoraDTO();
	  
	  dto.setOperacion("-");
	  dto.setOperador1(new Double(15));
	  dto.setOperador2(new Double(10));
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, new Double(5));
	 }
	 
	 @Test
	 void testDtoNull() {
	  CalculadoraDTO dto = null;
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, null);
	 }

	 @Test
	 void testOpNull() {
	  CalculadoraDTO dto = new CalculadoraDTO();
	  dto.setOperador1(new Double(15));
	  dto.setOperador2(new Double(10));
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, null);
	 }
	 
	 @Test
	 void testOperador1() {
	  CalculadoraDTO dto = new CalculadoraDTO();
	  dto.setOperador2(new Double(10));
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, null);
	 }
	 
	 @Test
	 void testOperador2() {
	  CalculadoraDTO dto = new CalculadoraDTO();
	  dto.setOperador1(new Double(10));
	  
	  Double result = controller.calcular(dto);
	  
	  assertEquals(result, null);
	 }

}
