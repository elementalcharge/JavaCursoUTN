package com.utn.modelo;

public class VehiculoElectrico extends Vehiculo {

	public VehiculoElectrico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoElectrico(String nombre, String patente, String marca) {
		super(nombre, patente, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [nombre=" + getNombre() + ", patente=" + getPatente() + ", marca=" + getMarca() + "]";
	}

}
