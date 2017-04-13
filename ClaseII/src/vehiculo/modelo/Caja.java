package vehiculo.modelo;

import vehiculo.enumeradores.TipoCaja;

public class Caja {
	private TipoCaja tipo;
	
	private int velocidades;

	public TipoCaja getTipo() {
		return tipo;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public Caja(TipoCaja tipo, int velocidades) {
		super();
		this.tipo = tipo;
		this.velocidades = velocidades;
	}
	
}
