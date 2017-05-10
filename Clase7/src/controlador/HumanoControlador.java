package controlador;

import modelo.humano.Humano;

public class HumanoControlador {

	private Humano humano;

	public HumanoControlador(Humano humano) {//
		
		this.humano = humano;
	}
	public void hablar() throws MiExcepcion {
		try {
			humano.hablar();
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			throw new MiExcepcion(e.getMessage());
		}
	}
}
