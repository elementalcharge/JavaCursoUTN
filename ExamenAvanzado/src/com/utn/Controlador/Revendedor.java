package com.utn.Controlador;

public class Revendedor extends Persona{

	private int bebidasCompradas;
	private final int NumCliente;
	public Revendedor(String nombre, String apellido, String email, int correo, int bebidasCompradas, int numCliente) {
		super(nombre, apellido, email, numCliente, numCliente);
		
		this.bebidasCompradas = bebidasCompradas;
		NumCliente = numCliente;
	}
	public final int getNumCliente() {
		return NumCliente;
	}
	
	
	
	@Override
	public String toString() {
		return "Revendedor [bebidasCompradas=" + bebidasCompradas + ", NumCliente=" + NumCliente + ", toString()="
				+ super.toString() + "]";
	}
	public final int getBebidasCompradas() {
		return bebidasCompradas;
	}
	public final void setBebidasCompradas(int bebidasCompradas) {
		this.bebidasCompradas = bebidasCompradas;
	}
}
