package com.utn.vista;

import com.utn.controlador.CuentaControlador;
import com.utn.controlador.EmpleadoControlador;
import com.utn.modelo.Empleado;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaControlador cc = new CuentaControlador();
		cc.obtenerSaldo();
		cc.retiroDinero(122);
		cc.acreditoDinero(2000);
		cc.obtenerSaldo();
		cc.retiroDineroCC(3000);
		cc.retiroDineroCC(4000);
		cc.obtenerSaldoCC();
		cc.chequeoSaldoCC();
		
		EmpleadoControlador ec= new EmpleadoControlador();
		ec.altaEmpleado("pablo", "Sanchez", "32185621321");
		Empleado e1=ec.getEmpleado();
		ec.altaEmpleado("nicolas", "gagliarti", "32185621321");
		Empleado e2=ec.getEmpleado();
		
		ec.altaEmpleado("pablo", "Sanchez", "32185621321");
		Empleado e3=ec.getEmpleado();
		System.out.println("empleado 1"+ e1.getNombre()+" apellido"+ e1.getApellido());
		System.out.println("empleado 2"+ e2.getNombre()+" apellido"+ e2.getApellido());
		System.out.println("empleado 3"+ e3.getNombre()+" apellido"+ e3.getApellido());
		
		
	}

}
