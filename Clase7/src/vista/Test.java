package vista;

import controlador.HumanoControlador;
import controlador.MiExcepcion;
import modelo.humano.Humano;
import modelo.humano.Latino;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanoControlador gc1=new HumanoControlador(new Latino("jamon", 12, "0", true, true));
		try {
			gc1.hablar();
		} catch (MiExcepcion e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			gc1.hablar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
