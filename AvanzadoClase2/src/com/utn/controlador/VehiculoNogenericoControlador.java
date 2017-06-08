package com.utn.controlador;

import com.utn.modelo.Vehiculo;
import com.utn.modelo.VehiculoElectrico;

import clase2.ava.interfaces.IVehiculoNoGenerico;

public class VehiculoNogenericoControlador  implements IVehiculoNoGenerico{

	@Override
	public Vehiculo crearVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Vehiculo> T crearVehiculoGenerico() {
		// TODO Auto-generated method stub
		return (T) new VehiculoElectrico();
	}

	@Override
	public void muestroVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void muestroVehiculoNoGenerico() {
		// TODO Auto-generated method stub
		//return(T)"AVSDF"
	}

	
}
