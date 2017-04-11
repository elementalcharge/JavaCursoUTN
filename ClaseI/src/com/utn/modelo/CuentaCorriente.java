package com.utn.modelo;

public class CuentaCorriente {
	private double saldo;

	public CuentaCorriente(double saldo) {
		
		this.saldo = saldo;
		System.out.println("se inicializo con"+ saldo);
	}
	public double getSaldo() {
		return saldo;
	}
	//seter mentiroso
	public boolean descontarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		if(!(saldo<=dinero)){
			System.out.println("no puede retirar mas dinero");
			return false;
		}else {
			saldo=saldo-dinero;
			return true;
		}
	}
	
}
