package tp2.controlador;

import java.util.ArrayList;

import tp2.modelo.Cajero;
import tp2.modelo.Factura;

public class Tienda {

	private ArrayList<Cajero> cajas;
	
	int clientesFacturados;
	int clientesSinFacturar;
		
	public Tienda() {
		super();
		this.cajas = new ArrayList<Cajero>();
		
		cajas.add(new Cajero(true));
		cajas.add(new Cajero(true));
		cajas.add(new Cajero(false));
		cajas.add(new Cajero(false));
		cajas.add(new Cajero(false));
		cajas.add(new Cajero(false));
		
		ArrayList<Thread> hilos= new ArrayList<Thread>();
		
		
			
			for (Cajero cajero : cajas) {
	
				hilos.add(new Thread (cajero));		
			}
			for (Thread thread : hilos) {
				thread.start();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tickets emitidos"+Cajero.ticketsEmitidos+" y totales" +Cajero.ticketsTotales);
			
	}
	public void parcial(String usuario,String clave) {
		if (usuario.equals("01354")&&clave.equals("frenchisDobles")) {
			System.out.println(StockController.getReporte());
		}
	}
	public void atender() {
		for (Cajero cajero : cajas) {
			
		
			if((Cajero.ticketsEmitidos/(Cajero.ticketsTotales+1))*100>60 || cajero.EmiteTicket)
			{
				cajero.atender();
	
			}
		}
		
		
	}
	
}
