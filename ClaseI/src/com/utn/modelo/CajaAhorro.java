package com.utn.modelo;

public class CajaAhorro {
	//atributos de la clase
	private double saldo;
	private String descripcion;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CajaAhorro(double saldo, String descripcion) {
		this.saldo = saldo;
		this.descripcion = descripcion;
	}
	
	
}
