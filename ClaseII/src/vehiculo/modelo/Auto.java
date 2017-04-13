package vehiculo.modelo;

import vehiculo.enumeradores.Frenos;
import vehiculo.enumeradores.Modulo;

public class Auto {
	private Motor motor;
	public Auto(Motor motor, Rueda rueda, Caja caja, Modulo modulo, Frenos frenos) {
		
		this.motor = motor;
		this.rueda = rueda;
		this.frenos = frenos;
		this.moduloElectronico = modulo;
	}
	private Rueda rueda;
	private Caja caja;
	private Frenos frenos;
	private Modulo moduloElectronico;
	private int patente;
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public Motor getMotor() {
		return motor;
	}
	public Rueda getRueda() {
		return rueda;
	}
	public Frenos getFrenos() {
		return frenos;
	}
	public Modulo getModuloElectronico() {
		return moduloElectronico;
	}
	
}
