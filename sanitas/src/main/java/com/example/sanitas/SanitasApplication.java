package com.example.sanitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sanitas.Controller.CalculadoraController;
import com.example.sanitas.dto.CalculadoraDTO;

@SpringBootApplication
public class SanitasApplication {

	
	public static void main(String[] args) {
		//SpringApplication.run(SanitasApplication.class, args);
		  ApplicationContext cts = SpringApplication.run(SanitasApplication.class, args);
		  CalculadoraController calculadoraController = cts.getBean(CalculadoraController.class);
		CalculadoraDTO calculo = new CalculadoraDTO();
		calculo.setOperacion("+");
		calculo.setOperador1(new Double(10));
		calculo.setOperador2(new Double(20));

		calculadoraController.calcular(calculo);
	}
}
