package tp2.modelo;

import tp2.interfaces.Combo;

public class Factura {

	Combo orden;
	public Combo getOrden() {
		return orden;
	}
	public int getCosto() {
		return costo;
	}
	public boolean isFacturaEmitida() {
		return facturaEmitida;
	}
	int costo;
	boolean facturaEmitida;
	public Factura(Combo orden, int costo, boolean facturaEmitida) {
		super();
		this.orden = orden;
		this.costo = costo;
		this.facturaEmitida = facturaEmitida;
	}
	@Override
	public String toString() {
		return "Factura [orden=" + orden + ", costo=" + costo + ", facturaEmitida=" + facturaEmitida + "]";
	}
	
}
