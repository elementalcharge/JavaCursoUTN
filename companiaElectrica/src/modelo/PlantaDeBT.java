package modelo;

import java.util.ArrayList;

import enumerables.Satisfaccion;
import interfaces.ConsumidorDeElectricidad;

public class PlantaDeBT implements ConsumidorDeElectricidad{
	public static final int alimenta=100;
	private int consumeDeMTs;
	private ArrayList<Vivienda> casasQueAlimenta;
	@Override
	public int consume() {
		
		return consumeDeMTs;
	}
	public PlantaDeBT() {
		super();
		this.consumeDeMTs = 0;
		this.casasQueAlimenta = new ArrayList<Vivienda>();
	}
	
	
	public ArrayList<Vivienda> getCasasQueAlimenta() {
		return casasQueAlimenta;
	}
	public boolean addCasasQueAlimenta(Vivienda casasQueAlimenta) {
		if (consumeDeMTs<alimenta) {
			this.casasQueAlimenta.add(casasQueAlimenta);
			consumeDeMTs++;
			return true;
		}
		return false;
		
	}
	@Override
	public int sobra() {
		
		return consumeDeMTs;
	}
	@Override
	public ArrayList<Vivienda> clientesParaPromociones() {
		ArrayList<Vivienda> paraPromocionarles= new ArrayList<Vivienda>();
		for (Vivienda vivienda : casasQueAlimenta) {
			if (vivienda.getSatifaccion()==Satisfaccion.NORMAL ||vivienda.getSatifaccion()==Satisfaccion.ENOJADO) {
				paraPromocionarles.add(vivienda);
			}
		}
		return paraPromocionarles;
	}
	
	
}
