package modelo;

import java.util.ArrayList;

public class Repartidor {

	private String nombre;
	private boolean disponible;
	private ArrayList<Pedidos> entregasDelRepartidor;
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Repartidor(String nombre) {
		
		this.nombre = nombre;
		disponible=true;
		entregasDelRepartidor=new ArrayList<Pedidos>();
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Pedidos> getEntregasDelRepartidor() {
		return entregasDelRepartidor;
	}
	
	public void armarPedido(String gusto1, String gusto2 ) {
		entregasDelRepartidor.add(new Cono(gusto1, gusto2));
		disponible=false;
	}
	public void armarPedido(String gusto1, String gusto2, String gusto3, Plus extra) {
		entregasDelRepartidor.add(new VasoDeCuarto(gusto1, gusto2, gusto3,  extra));
		disponible=false;
	}
	public void armarPedido(String gusto1, String gusto2, String gusto3, String gusto4, Plus extra) {
		entregasDelRepartidor.add(new PoteDeKilo(gusto1, gusto2, gusto3, gusto4,  extra));
		disponible=false;
		
	}
	@Override
	public String toString() {
		return "Repartidor [nombre=" + nombre + ", disponible=" + disponible + ", entregasDelRepartidor="
				+ entregasDelRepartidor + "]";
	}
}
