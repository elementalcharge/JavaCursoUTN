package avanzadoClase1.com.utn.modelo;

public class Adult extends Persona<String> {
	private String nombre, apellido;
	private boolean licenciaDeConducir, trabajador;
	public String getNombre() {
		return nombre;
	}
	public Adult() {
		super();
	}
	public Adult(String nombre, String apellido, boolean licenciaDeConducir, boolean trabajador) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.licenciaDeConducir = licenciaDeConducir;
		this.trabajador = trabajador;
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
	public boolean isLicenciaDeConducir() {
		return licenciaDeConducir;
	}
	public void setLicenciaDeConducir(boolean licenciaDeConducir) {
		this.licenciaDeConducir = licenciaDeConducir;
	}
	public boolean isTrabajador() {
		return trabajador;
	}
	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}
	@Override
	public String devuelvoT() {
		// TODO Auto-generated method stub
		return super.devuelvoT();
	}
	
}
