package modelo;

import java.util.Arrays;

public abstract class Pedidos {
	private String[] gustos;

	@Override
	public String toString() {
		return "Pedidos [gustos=" + Arrays.toString(gustos) + "]";
	}

	public String[] getGustos() {
		return gustos;
	}

	public void setGustos(String[] gustos) {
		this.gustos = gustos;
	}

	public Pedidos(String[] gustos) {
		super();
		this.gustos = gustos;
	}
	
}
