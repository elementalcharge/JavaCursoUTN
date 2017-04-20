package com.utn.modelo;

public class Medico {
	int Atendidos;
	final static int maxAtendidos=5;
	
	public String Atender(Animal animal) {
		return "medicado ";
	}

	public int getAtendidos() {
		return Atendidos;
	}

	public void setAtendidos(int atendidos) {
		Atendidos = atendidos;
	}

	public static int getMaxatendidos() {
		return maxAtendidos;
	}
	
}
