package modelo;

import modelo.interfaces.Ivehiculo;

public class Moto extends Vehiculo implements Ivehiculo{

	private Freno freno;

	@Override
	public boolean encender(Motor motor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean encender() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void frenar(double canMetros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		switch (freno.getTipoFreno()){
		case "campana":
			break;
		}
	}

	@Override
	public String direccion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean retroceder() {
		// TODO Auto-generated method stub
		return false;
	}

}
