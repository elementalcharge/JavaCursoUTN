package com.utn.dao;

public abstract class Vehiculo {
	
	private String patente;
	public abstract void encender() ;
	public abstract void frenar();
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + "]";
	}
	
}
