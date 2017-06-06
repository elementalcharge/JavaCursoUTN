package modelo;

import enumerables.Satisfaccion;

public class Vivienda {
	
	private String nombreDeTitular, calle;
	
	private Satisfaccion satifaccion;
	private int consume;
	public Vivienda(String nombreDeTitular, String calle, Satisfaccion satifaccion, int consume) {
		super();
		this.nombreDeTitular = nombreDeTitular;
		this.calle = calle;
		this.satifaccion = satifaccion;
		this.consume = consume;
	}
	public String getNombreDeTitular() {
		return nombreDeTitular;
	}
	public void setNombreDeTitular(String nombreDeTitular) {
		this.nombreDeTitular = nombreDeTitular;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Satisfaccion getSatifaccion() {
		return satifaccion;
	}
	public void setSatifaccion(Satisfaccion satifaccion) {
		this.satifaccion = satifaccion;
	}
	public int getConsume() {
		return consume;
	}
	public void setConsume(int consume) {
		this.consume = consume;
	}
}
