package controlador;

import modelo.Vehiculo;
import modelo.interfaces.Ivehiculo;

public class VehiculoControlador {
	public void creoVehiculo(Ivehiculo vehiculo){
		System.out.println("creo vehiculo");
		System.out.println("creado"+vehiculo.getClass().getSimpleName());
		vehiculo.encender();
	}
}
