package controler;

import java.util.ArrayList;

import modelo.Auto;
import modelo.Camion;
import modelo.Moto;
import modelo.Vehiculo;

public class ControladorDeVehiculo {

	public void creoVehiculo() {
		// TODO Auto-generated method stub
		
		Auto a= new Auto(false, 0);
		a.encender();
		a.setPatente("saraza");
		a.setCantPuertas(123);
		a.setBaul(true);
		
		System.out.println(a);
		
		Moto m= new Moto();
		m.encender();
		m.frenar();
		m.setManubrio(true);
		m.setVelMax(543);
		m.setPatente("zas 241");
		Vehiculo a1= new Auto(true, 0);
		a1.setPatente("asd 423");
		((Auto)a1).setBaul(true);
		((Auto)a1).setCantPuertas(15);
		if (a1 instanceof Auto) {
			Auto autito= (Auto) a1;
			autito.setBaul(true);
			autito.setCantPuertas(531);
			
		}
		if (a1 instanceof Moto) {
			Moto motito=(Moto) a1;
			motito.setManubrio(false);
			motito.setVelMax(15313);
			
			
		}
		if (a1 instanceof Camion) {
			Camion camioncito=(Camion) a1;
			camioncito.setAcoplado(false);
			camioncito.setPatente("ge");
			
			
		}
		Vehiculo a2= new Moto();
		System.out.println(a2);
		a1.frenar();
		
		ArrayList<Vehiculo>listaVehiculo= new ArrayList<Vehiculo>();
		listaVehiculo.add(new Auto(true, 53));
		listaVehiculo.add(new Moto());
		listaVehiculo.add(new Camion());
		for (Vehiculo vehiculo : listaVehiculo) {
			System.out.println("clase:" +vehiculo.getClass().getSimpleName());
			vehiculo.encender();
			vehiculo.frenar();
			System.out.println("=======================================");
			
		}
	}
}
