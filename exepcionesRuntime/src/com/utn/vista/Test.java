package com.utn.vista;

import src.CuentaControlador;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaControlador cuenta= new CuentaControlador();
		cuenta.extraigoDinero();
		if (args.length>0) {
			switch (args[0]) {
			case "enc":
				cuenta.extraigoDinero();
				break;
			case "guardar":
				cuenta.extraigoDinero();
				break;
			default:
				break;
			}
			cuenta.extraigoDinero();
		}
	}

}
