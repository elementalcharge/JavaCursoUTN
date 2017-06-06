package avanzadoClase1.com.utn.modelo;

public class Nino {
	private String nombre, apellido;
	private boolean estudiante, deportista;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Nino() {
		super();
	}
	public Nino(String nombre, String apellido, boolean estudiante, boolean deportista) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudiante = estudiante;
		this.deportista = deportista;
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
	public boolean isDeportista() {
		return deportista;
	}
	public void setDeportista(boolean deportista) {
		this.deportista = deportista;
	}
	private void practicaDeporte() {
		// TODO Auto-generated method stub
		if (deportista) {
			System.out.println("practica");
		}
	}
}
