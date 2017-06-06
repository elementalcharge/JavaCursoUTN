package avanzadoClase1.com.utn.modelo;

public class Adolecente {
	private String nombre, apellido;
	private boolean estudiante, trabajador;
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
	public boolean isEstudiante() {
		return estudiante;
	}
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	public boolean isTrabajador() {
		return trabajador;
	}
	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}
	public Adolecente(String nombre, String apellido, boolean estudiante, boolean trabajador) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudiante = estudiante;
		this.trabajador = trabajador;
	}
	public Adolecente() {
		super();
	}
	
	
}
