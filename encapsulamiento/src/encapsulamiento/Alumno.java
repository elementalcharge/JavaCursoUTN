package encapsulamiento;

import java.util.ArrayList;

public class Alumno {
	
	ArrayList<Materia> mateiasInscripta;
	boolean asistencia;
	private int legajo;
	private String nombre;
	
	public Alumno(int legajo, String nombre) {
		
		this.legajo = legajo;
		this.nombre = nombre;
		mateiasInscripta=new ArrayList<Materia>();
	}
	
	
	public ArrayList<Materia> getMateiasInscripta() {
		return mateiasInscripta;
	}


	public void setMateiasInscripta(Materia mateiasInscripta) {
		this.mateiasInscripta.add( mateiasInscripta);
	}


	public boolean isAsistencia() {
		return asistencia;
	}


	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
}
