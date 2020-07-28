package com.example.sanitas.dto;

public class CalculadoraDTO {

	private Double operador1;
	private Double operador2;
	private String operacion;

	public CalculadoraDTO() {
		super();
	}

	public Double getOperador1() {
		return operador1;
	}

	public void setOperador1(Double operador1) {
		this.operador1 = operador1;
	}

	public Double getOperador2() {
		return operador2;
	}

	public void setOperador2(Double operador2) {
		this.operador2 = operador2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
}
