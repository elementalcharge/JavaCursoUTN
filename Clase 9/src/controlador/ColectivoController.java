package controlador;

import interfaces.Icolectivo;

public class ColectivoController {
	private Icolectivo colectivo;
	public ColectivoController(Icolectivo colectivo) {
		super();
		this.colectivo = colectivo;
	}
	public void precioXRecorrido(double descuento){
		colectivo.recorrido();
		System.out.println("el valor es"+(colectivo.precioBoleto()-descuento));
	}
	public void linea() {
		
	}
}
