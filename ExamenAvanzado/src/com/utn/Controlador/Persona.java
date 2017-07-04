package com.utn.Controlador;

public class Persona {
	private String nombre, apellido, email;
	private int correo;
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
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final int getCorreo() {
		return correo;
	}
	public final void setCorreo(int correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", correo=" + correo + "]";
	}
	public Persona(String nombre, String apellido, String email, int correo, int bebidasCompradas) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.correo = correo;
		
	} 
}
