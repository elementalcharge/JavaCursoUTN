package com.utn.modelo;

public class Empleado {
	private String nombre;
	private String apellido;
	private String DNI;
	private CuentaCorriente cc;
	private CajaAhorro ca;
	public Empleado(String nombre, String apellido, String dNI, CuentaCorriente cc, CajaAhorro ca) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.cc = cc;
		this.ca = ca;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public CuentaCorriente getCc() {
		return cc;
	}
	public CajaAhorro getCa() {
		return ca;
	}

}
