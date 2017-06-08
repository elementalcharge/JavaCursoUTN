package com.utn.controlador;

import com.utn.modelo.Vehiculo;
import com.utn.modelo.VehiculoElectrico;
import com.utn.modelo.VehiculoNaftero;

import clase2.ava.interfaces.Ivehiculo;

public class VehiculoControlador implements Ivehiculo<Vehiculo>{

	@Override
	public Vehiculo CrearVehiculo(String tipo) {
		// TODO Auto-generated method stub
		if( tipo.toLowerCase().equals("electrico"))
		return new VehiculoElectrico();
		return new VehiculoNaftero();
	}

	@Override
	public void muestroVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}


}
