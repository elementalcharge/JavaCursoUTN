package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import modelo.Repartidor;

public class Heladeria {
	private Cajero[] cajas;
	private ArrayList<Repartidor> empleadosRepartidores;
	public Heladeria() {
		cajas= new Cajero[]{new Cajero(5),new Cajero(10), new Cajero(15)};
		empleadosRepartidores= new ArrayList<Repartidor>();
	}
	
	public void agregarEmpleadosRepartidor(String nombre) {
		this.empleadosRepartidores.add(new Repartidor(nombre));
	}

	private Repartidor getEmpleadosRepartidoresLibre() {
		for (Repartidor repartidor : empleadosRepartidores) {
			if (repartidor.isDisponible()) {
				return repartidor;
			}
		}
		return null;
		
	}
	private Cajero getCajaLibre(){
		for (Cajero cajero : cajas) {
			if (cajero.getAtendio()<cajero.getPuedeAtenderMax() && cajero.isDisponible()) {
				return cajero;
			}
		}
		return null;
	}
	public void tomarPedido() {
		Scanner input= new Scanner(System.in);
		
		Repartidor repartidorDesignado= getEmpleadosRepartidoresLibre();
		Cajero cajaDesignada= getCajaLibre();
		System.out.println("elegi pedido 1_cono, 2_cuarto,3_kilo");
		int opcion=input.nextInt();
		
		if(repartidorDesignado!=null && cajaDesignada!=null){
			
			cajaDesignada.obtenerPedido(repartidorDesignado, opcion);
		}
		else{
			System.out.println("no hay cajas o repartidores disponibles");
		}
		
	}
	@Override
	public String toString() {
		return "Heladeria [cajas=" + Arrays.toString(cajas) + ", empleadosRepartidores=" + empleadosRepartidores + "]";
	}

	public void liberarCajas() {
		for (Cajero cajero : cajas) {
			cajero.setDisponible(true);
		}
	}
	public void volvioRepartidor(int repartidor) {
		empleadosRepartidores.get(repartidor).setDisponible(true);
	}
	public void liberarRepartidores() {
		for (Repartidor repartidor : empleadosRepartidores) {
			repartidor.setDisponible(true);
		}
	}
	
}
