package com.utn.controlador;

import com.utn.modelo.CajaAhorro;
import com.utn.modelo.CuentaCorriente;
import com.utn.modelo.Empleado;

public class EmpleadoControlador {
	//atributo empleado
	private Empleado empleado;
	/*
	 * un constructor vacio es que no tiene funcionalidad
	 */
	public void altaEmpleado(String nombre, String apellido, String dNI) {
		empleado= new Empleado(nombre, apellido, dNI, new CuentaCorriente(15000), new CajaAhorro(0, "descripcion durr :p "));
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	
}
