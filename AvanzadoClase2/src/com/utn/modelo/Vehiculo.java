package com.utn.modelo;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre,  marca;
	private transient String  patente;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Vehiculo(String nombre, String patente, String marca) {
		super();
		this.nombre = nombre;
		this.patente = patente;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", patente=" + patente + ", marca=" + marca + "]";
	}

	public Vehiculo() {
		super();
	}
	
}
