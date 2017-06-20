package com.utn.dao;

public final class VehiculoFinal extends Vehiculo {

	private boolean baul;
	private int cantPuertas;
	private String patente;
	private String marca;
	private String color;
	
	
	public VehiculoFinal() {
		super();
	}
	public VehiculoFinal(String patente, String marca, String color) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
	}
	public final String getPatente() {
		return patente;
	}
	public  void setPatente(final String patente) {
		this.patente = patente;
	}
	public final String getMarca() {
		return marca;
	}
	public  void setMarca(final String marca) {
		this.marca = marca;
	}
	public final String getColor() {
		return color;
	}
	public  void setColor(final String color) {
		this.color = color;
	}
	public boolean isBaul() {
		return baul;
	}
	public void setBaul(final boolean baul) {
		this.baul = baul;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(final int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public VehiculoFinal(boolean baul, int cantPuertas) {
		super();
		this.baul = baul;
		this.cantPuertas = cantPuertas;
	}
	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
		System.out.println("estoy frenando con ABS");
	}
	@Override
	public String toString() {
		return "auto [baul="+baul+"puertas="+cantPuertas+"]"+super.toString();
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}
}
