package com.utn.controlador;

import com.utn.modelo.CajaAhorro;
import com.utn.modelo.CuentaCorriente;

public class CuentaControlador {
	//atributo global privado
	private CajaAhorro ca;
	private CuentaCorriente cc;
	
	public CuentaControlador() {
		ca = new CajaAhorro(1000, "ALGO");
		ca.setSaldo(1000);
		asignoCuentaCorriente(5000);
	}
	public void obtenerSaldo() {
		
		ca.setSaldo(1000);
		System.out.println("su saldo actual es: " + ca.getSaldo()+ " pesos");
	}
	public void retiroDinero(double dinero) {
		double resultado =this.ca.getSaldo()- dinero;
		ca.setSaldo(resultado);
		System.out.println("su saldo actual es: " +ca.getSaldo()+ " pesos");
	}
	public void acreditoDinero(double dinero) {
		ca.setSaldo(ca.getSaldo()+dinero);
	}
	public void retiroDineroCC(double dinero) {
		// TODO Auto-generated method stub
		
		if (cc.descontarDinero(dinero)) {
			System.out.println("no se puede retirar mas dinero");
		}
		else {
			System.out.println("su saldo actual es: " +cc.getSaldo()+ " pesos");
		}
		

	}
	public void obtenerSaldoCC() {
		
		System.out.println("su saldo actual es: " + cc.getSaldo()+ " pesos");
	}
	public void asignoCuentaCorriente(double monto) {
		if(monto <=20000){
			cc=new CuentaCorriente(3000.0);
		}else if (monto>=50000.0) {
			cc=new CuentaCorriente(3000.0);
		}else {
			cc=new CuentaCorriente(5000);
		}
		// TODO Auto-generated method stub

	}
	public void  chequeoSaldoCC() {
		cc.getSaldo();
	}
}
