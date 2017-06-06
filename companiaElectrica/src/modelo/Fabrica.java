package modelo;

import java.util.ArrayList;

import enumerables.Satisfaccion;
import interfaces.ConsumidorDeElectricidad;
import interfaces.Respaldador;

public class Fabrica implements ConsumidorDeElectricidad, Respaldador {
	
	private int alimenta=2*PlantaDeBT.alimenta;
	private int consumePorSiMisma;
	private int consumenLasCasas;
	private ArrayList<Vivienda> casasQueAlimenta;
	
	@Override
	public int consume() {
		
		return consumePorSiMisma+consumenLasCasas;
	}

	public ArrayList<Vivienda> getCasasQueAlimenta() {
		return casasQueAlimenta;
	}

	public void addCasasQueAlimenta(Vivienda casasAAñadir) {
		if (alimenta-consumePorSiMisma>consumenLasCasas) {
			this.casasQueAlimenta.add(casasAAñadir);
			consumenLasCasas++;
		}
		
	}

	public int getAlimenta() {
		return alimenta;
	}

	public int getConsumiPorSiMisma() {
		return consumePorSiMisma;
	}

	public int getConsumenLasCasas() {
		return consumenLasCasas;
	}

	@Override
	public int sobra() {
		
		return alimenta-consumePorSiMisma-consumenLasCasas;
	}

	public Fabrica(int consumePorSiMisma) {
		super();
		this.consumePorSiMisma = consumePorSiMisma;
		casasQueAlimenta= new ArrayList<Vivienda>();
	}

	@Override
	public int ofrece() {
		
		return sobra();
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
