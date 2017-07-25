package tp2.modelo;

public class Contacto {
	private String nombre, apellido, nacimiento, telefono;
	
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final String getApellido() {
		return apellido;
	}
	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public final String getNacimiento() {
		return nacimiento;
	}
	public final void setEmail(String email) {
		this.nacimiento = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Contacto(String nombre, String apellido, String nacido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacido;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", telefono=" + telefono
				+ "]";
	}
	
}
