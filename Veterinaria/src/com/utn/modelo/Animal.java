package com.utn.modelo;

import com.utn.enumerador.Typo;

public class Animal {

	Typo tipo;
	String nombre;
	String raza;
	int edad;
	String causaDeAtencion;
	String medicamento;
	public Animal(Typo tipo, String nombre, String raza, int edad, String causaDeAtencion) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.causaDeAtencion = causaDeAtencion;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public Typo getTipo() {
		return tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public int getEdad() {
		return edad;
	}
	public String getCausaDeAtencion() {
		return causaDeAtencion;
	}
	
}
