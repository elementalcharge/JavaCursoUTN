package encapsulamiento;

import java.util.ArrayList;

public class Materia {
	//lista de profesores
	private ArrayList<Docente> docentes;
	private	String nombre;
	private String diaHorario;
	private ArrayList<Alumno> listaAlumnos;
	
	public Materia( String nombre, String diaHorario) {
		this.nombre = nombre;
		this.diaHorario = diaHorario;
		docentes=new ArrayList<Docente>();
		listaAlumnos= new ArrayList<Alumno>();
	}
	public ArrayList<Docente> getDocentes() {
		return docentes;
	}
	public void AgregoDocentes(Docente docentes) {
		this.docentes.add(docentes);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiaHorario() {
		return diaHorario;
	}
	public void setDiaHorario(String diaHorario) {
		this.diaHorario = diaHorario;
	}
	public Materia() {
		docentes=new ArrayList<Docente>();
		listaAlumnos= new ArrayList<Alumno>();
	}
	
	
}
