package com.modelo;

public class Jugador {
	private int puntaje;
	private String nombre;
	@Override
	public String toString() {
		return "Jugador [puntaje=" + puntaje + ", nombre=" + nombre + "]";
	}
	public Jugador(int puntaje, String nombre) {
		super();
		this.puntaje = puntaje;
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public String getNombre() {
		return nombre;
	}
}
