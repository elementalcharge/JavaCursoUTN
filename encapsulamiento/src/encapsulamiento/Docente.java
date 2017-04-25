package encapsulamiento;

import java.util.ArrayList;

public class Docente {
	private String nombre;
	private String apellido;
	private ArrayList<String> especialidad;
	public Docente(String nombre, String apellido, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = new ArrayList<String>();
		this.especialidad.add(especialidad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<String> getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad.add(especialidad);
	}
	
	
}
