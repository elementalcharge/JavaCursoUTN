package tp2.modelo;

import tp2.enumerables.Bebida;
import tp2.interfaces.Combo;

public class PumperGrande implements Combo {
	String nombre="Pumer Mediano";
	Hamburguesa comida;
	Bebida paraTomar;
	private static int costo=4000;
	public PumperGrande(Bebida paraTomar,boolean centeno,int ketchup, int mayonesa,int moztasa, boolean bebidagrande) {
		super();
		
		this.comida = new Hamburguesa(3, 4, 0, 0, 0, 0, ketchup, mayonesa, moztasa, 3, 0, 0, 0);
		this.paraTomar = paraTomar;
		if (bebidagrande) {
			comida.setTamanoBebida(3);
		}else {
			comida.setTamanoBebida(2);
		}
		if (centeno) {

			comida.setPanConCentenos(1);
		}
		else{
			comida.setPanSinCentenos(1);
		}
		comida.setGinis(1);
	}
	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Hamburguesa consumeStock() {
		// TODO Auto-generated method stub
		return comida;
	}
	@Override
	public String toString() {
		return "PumperGrande [nombre=" + nombre + ", comida=" + comida + ", paraTomar=" + paraTomar + "]";
	}
}
