package modelo;

import java.util.ArrayList;

import interfaces.ConsumidorDeElectricidad;

public class PlantaDeMT {
	public static final int Alimenta=20*PlantaDeBT.alimenta;
	private ArrayList<ConsumidorDeElectricidad> consumidoresDeMT;
	private int energiaRestante;
	public void agregarConsumidor(ConsumidorDeElectricidad nuevoConsumidor){
		if (nuevoConsumidor.consume()<=energiaRestante) {
			energiaRestante-=nuevoConsumidor.consume();
			consumidoresDeMT.add(nuevoConsumidor);
		}
		
		
		 
	}
	public boolean hayPlantasDeBTSinUso() {
		for (ConsumidorDeElectricidad consumidorDeElectricidad : consumidoresDeMT) {
			if (consumidorDeElectricidad.consume()==consumidorDeElectricidad.sobra()) {
				return true;
			}
		}
		return false;
		
	}
	private void ActualizarConsumo() {
		energiaRestante=Alimenta;
		for (ConsumidorDeElectricidad consumidorDeElectricidad : consumidoresDeMT) {
			energiaRestante-=consumidorDeElectricidad.consume();
		}
		
	}
	public ArrayList<ConsumidorDeElectricidad> getConsumidoresDeMT() {
		return consumidoresDeMT;
	}
	
	public int getEnergiaRestante() {
		ActualizarConsumo();
		return energiaRestante;
	}
	
	public static int getAlimenta() {
		return Alimenta;
	}
	public ArrayList<Vivienda> viviendasParaPromociones() {
		ArrayList<Vivienda> paraPromocionarles = new ArrayList<Vivienda>();
		for (ConsumidorDeElectricidad consumidorDeElectricidad : consumidoresDeMT) {
			ArrayList<Vivienda> vivienda=consumidorDeElectricidad.clientesParaPromociones();
			if (vivienda!=null) {
				for (Vivienda cliente : vivienda) {
					paraPromocionarles.add(cliente);
				}
			}
			
		}
		
		return paraPromocionarles;
		
	}
	
	
}
