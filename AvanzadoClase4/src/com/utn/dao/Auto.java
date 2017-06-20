package com.utn.dao;

public class Auto extends Vehiculo {

	private boolean baul;
	private int cantPuertas;
	private String patente;
	private String marca;
	private String color;
	
	
	public Auto() {
		super();
	}
	public Auto(String patente, String marca, String color) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
	}
	public boolean isBaul() {
		return baul;
	}
	public void setBaul(boolean baul) {
		this.baul = baul;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public Auto(boolean baul, int cantPuertas) {
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
