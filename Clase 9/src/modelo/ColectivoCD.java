package modelo;

import java.util.ArrayList;

import interfaces.Icolectivo;
import interfaces.Itransporte;

public class ColectivoCD  implements Icolectivo{

	@Override
	public double boleto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Chofer> cantChoferes() {
		// TODO Auto-generated method stub
		return new ArrayList<Chofer>();
	}
	@Override
	public void recorrido() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double recorrido(double distancia) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int cantMaxPasajeros() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String frecuencia() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String linea() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int precioBoleto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
