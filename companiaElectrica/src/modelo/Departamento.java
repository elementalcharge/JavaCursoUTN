package modelo;

import enumerables.Satisfaccion;
import interfaces.Respaldador;

public class Departamento extends Vivienda{
	public Departamento(String nombreDeTitular, String calle, Satisfaccion satifaccion, int consume) {
		super(nombreDeTitular, calle, satifaccion, consume);
		// TODO Auto-generated constructor stub
	}

	public Departamento(String nombreDeTitular, String calle, Satisfaccion satifaccion, int consume,
			Respaldador respaldo) {
		super(nombreDeTitular, calle, satifaccion, consume);
		this.respaldo = respaldo;
	}

	Respaldador respaldo;

	public Respaldador getRespaldo() {
		return respaldo;
	}

	public void setRespaldo(final Respaldador respaldo) {
		this.respaldo = respaldo;
		if(respaldo instanceof Fabrica) {
			((Fabrica) respaldo).addCasasQueAlimenta(this);
		}
	}
	
}
