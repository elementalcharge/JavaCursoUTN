package tp2.modelo;

import tp2.enumerables.Bebida;
import tp2.interfaces.Combo;

public class PumperFeliz implements Combo{

	String nombre="Pumer feliz";
	
	public PumperFeliz(  Bebida paraTomar,boolean Centeno,boolean jugeteVaron) {
		super();
		
		this.comida = new Hamburguesa(1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1);
		if (Centeno) {

			comida.setPanConCentenos(1);
		}
		else{
			comida.setPanSinCentenos(1);
		}
		if (jugeteVaron) {
			comida.setJugueteVaron(1);
		}
		else {
			comida.setJuegueteMujer(1);
		}
			
		this.paraTomar = paraTomar;
		
	}
	Hamburguesa comida;
	Bebida paraTomar;
	private static int costo=1000;
	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return costo;
	}
	@Override
	public Hamburguesa consumeStock() {
		// TODO Auto-generated method stub
		return comida;
	}
	@Override
	public String toString() {
		return "PumperFeliz [nombre=" + nombre + ", comida=" + comida + ", paraTomar=" + paraTomar + "]";
	}
	
	

}
