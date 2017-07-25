package tp2.modelo;

import java.util.ArrayList;

import tp2.enumerables.Bebida;
import tp2.interfaces.Combo;

public class SuperPumper implements Combo{
	String nombre="Super Pumper";
	ArrayList<Hamburguesa> comidas;
	Bebida paraTomar;
	
	private static int costo=5000;
	
	public SuperPumper( Bebida paraTomar,boolean centeno, int quesos, int huevos, int cebollas,int ketchup, int mayonesa,int moztasa, boolean bebidagrande) {
		super();
		
		comidas.add( new Hamburguesa(4, quesos, 0, 0, huevos, cebollas, ketchup, mayonesa, moztasa, 4, 0, 0, 0));
		this.paraTomar = paraTomar;
		if (bebidagrande) {
			comidas.get(0).setTamanoBebida(3);
		}else {
			comidas.get(0).setTamanoBebida(2);
		}
		if (centeno) {

			comidas.get(0).setPanConCentenos(1);
		}
		else{
			comidas.get(0).setPanSinCentenos(1);
		}
		comidas.get(0).setGinis(2);
		comidas.add( new Hamburguesa(1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0));
	}

	@Override
	public String toString() {
		return "SuperPumper [nombre=" + nombre + ", comidas=" + comidas + ", paraTomar=" + paraTomar + "]";
	}

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public Hamburguesa consumeStock() {
		// TODO Auto-generated method stub
		Hamburguesa costeDeStock= new Hamburguesa();
		for (Hamburguesa hamburguesa : comidas) {
			costeDeStock.setHamburguesas(costeDeStock.getHamburguesas()+hamburguesa.getHamburguesas());
			costeDeStock.setQuesos(costeDeStock.getQuesos()+hamburguesa.getQuesos());
			costeDeStock.setPanConCentenos(costeDeStock.getPanConCentenos()+hamburguesa.getPanConCentenos());
			costeDeStock.setPanSinCentenos(costeDeStock.getPanSinCentenos()+hamburguesa.getPanSinCentenos());
			costeDeStock.setHuevos(costeDeStock.getHuevos()+hamburguesa.getHuevos());
			costeDeStock.setCebollas(costeDeStock.getCebollas()+hamburguesa.getCebollas());
			costeDeStock.setKetchup(costeDeStock.getKetchup()+hamburguesa.getKetchup());
			costeDeStock.setMayonesa(costeDeStock.getMayonesa()+hamburguesa.getMayonesa());
			costeDeStock.setMoztasa(costeDeStock.getMoztasa()+hamburguesa.getMoztasa());
			costeDeStock.setPapas(costeDeStock.getPapas()+hamburguesa.getPapas());
			costeDeStock.setJuegueteMujer(costeDeStock.getJuegueteMujer()+hamburguesa.getJuegueteMujer());
			costeDeStock.setJugueteVaron(costeDeStock.getJugueteVaron()+hamburguesa.getJugueteVaron());
			costeDeStock.setTamanoBebida(costeDeStock.getTamanoBebida()+hamburguesa.getTamanoBebida());
			costeDeStock.setGinis(costeDeStock.getGinis()+hamburguesa.getGinis());
			
			
			
		}
		return costeDeStock;
	}
}
