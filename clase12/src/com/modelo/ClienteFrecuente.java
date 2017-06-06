package com.modelo;

import java.util.Scanner;

public class ClienteFrecuente implements IPersona{
	private double dinero;
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		if(dinero>habitacion.getPrecio()){
			System.out.println("reservada");
		}
	}

	@Override
	public void usar() {
		// TODO Auto-generated method stub
		try {
			Scanner input= new Scanner(System.in);
			System.out.println("servicio a la habitacion");
			
			String valor=input.nextLine();
			if (valor.toLowerCase().equals("si")) {
				boolean seguir=true;
				do {
					
				
				System.out.println("elija la opcion");
				System.out.println("1_delfin");
				System.out.println("2_butaca");
				System.out.println("3_culebra");
				System.out.println("4_estrella japonesa");
				String servicio=input.nextLine();
				switch (servicio.toLowerCase()) {
				case"1":
					this.dinero-=100;
					
					break;
				case "2":
					this.dinero-=100;
					
					break;
				case "3":
					this.dinero-=100;
					
					break;
				case "4":
					this.dinero-=100;
					
					break;
			

				default:
					seguir=false;
					break;
				}
				} while (seguir);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void salir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		
	}

}
