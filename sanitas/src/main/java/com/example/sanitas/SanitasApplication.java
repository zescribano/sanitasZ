package com.example.sanitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sanitas.controller.CalculadoraController;
import com.example.sanitas.dto.CalculadoraDTO;

@SpringBootApplication
public class SanitasApplication {

	public static void main(String[] args) {
		ApplicationContext cts = SpringApplication.run(SanitasApplication.class, args);
		CalculadoraController calculadoraController = cts.getBean(CalculadoraController.class);

		// Creamos el DTO que tendra los parametros de entrada del servicio
		CalculadoraDTO calculo = new CalculadoraDTO();
		calculo.setOperacion("+");
		calculo.setOperador1(new Double(10));
		calculo.setOperador2(new Double(20));

		calculadoraController.calcular(calculo);
	}
}
