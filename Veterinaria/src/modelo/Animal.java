package modelo;

import enumerador.Typo;

public abstract class Animal  {

	Typo tipo;
	String nombre;
	String raza;
	int edad;
	String causaDeAtencion;
	Revision resultadoDeRevision;
	public Animal(Typo tipo, String nombre, String raza, int edad, String causaDeAtencion) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.causaDeAtencion = causaDeAtencion;
	}
	public Revision getResultadoDeRevision() {
		return resultadoDeRevision;
	}
	public void setResultadoDeRevision(Revision resultadoDeRevision) {
		this.resultadoDeRevision = resultadoDeRevision;
	}
	public Typo getTipo() {
		return tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public int getEdad() {
		return edad;
	}
	public String getCausaDeAtencion() {
		return causaDeAtencion;
	}
	
}
