package tp2.modelo;

import tp2.enumerables.Bebida;
import tp2.interfaces.Combo;

public class PumperMediano implements Combo {
	String nombre="Pumer Mediano";
	Hamburguesa comida;
	Bebida paraTomar;
	private static int costo=2000;
	public PumperMediano(Bebida paraTomar,boolean centeno) {
		super();
		
		this.comida = new Hamburguesa(2, 2, 0, 0, 0, 1, 1, 1, 0, 2, 0, 0, 2);
		this.paraTomar = paraTomar;
		if (centeno) {

			comida.setPanConCentenos(1);
		}
		else{
			comida.setPanSinCentenos(1);
		}
	}
	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return costo;
	}
	@Override
	public Hamburguesa consumeStock() {
		// TODO Auto-generated method stub
		return comida ;
	}
	@Override
	public String toString() {
		return "PumperMediano [nombre=" + nombre + ", comida=" + comida + ", paraTomar=" + paraTomar + "]";
	}
}
