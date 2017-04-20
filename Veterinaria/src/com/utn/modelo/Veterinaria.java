package com.utn.modelo;

public class Veterinaria {

	final int maxAtiendeVeterinaria=20;
	int atendidosVeterinaria;
	Medico[] medicos;
	public Veterinaria(int atendidosVeterinaria, Medico[] medicos) {
		
		this.atendidosVeterinaria = atendidosVeterinaria;
		this.medicos = medicos;
	}
	
	
}
