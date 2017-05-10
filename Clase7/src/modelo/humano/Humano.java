package modelo.humano;

import controlador.MiExcepcion;
import modelo.Mamifero;

public abstract class Humano extends Mamifero {

	private String nombre;
	private int edad;
	private String id;
	public void razonar(){
		System.out.println("hmmmnn");
	}
	public Humano() {
		
	}
	public Humano(String nombre, int edad, String id) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}
	public abstract void  hablar() throws MiExcepcion;
}
