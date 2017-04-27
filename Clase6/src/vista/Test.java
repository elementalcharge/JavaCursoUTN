package vista;

import controler.ControladorDeVehiculo;
import modelo.Auto;
import modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto a= new Auto(true, 4);
		a.setPatente("251.31a a3213");
		System.out.println(a);
		ControladorDeVehiculo a1= new ControladorDeVehiculo();
		a1.creoVehiculo();
	}

}
