package controlador;

import java.util.ArrayList;

import modelo.PlantaDeBT;
import modelo.PlantaDeMT;
import modelo.Vivienda;

public class PlantasElectricasControlers {
	private ArrayList<PlantaDeMT> plantasMT;
	
	public boolean hayCentralesDeBTSinUso(){
		for (PlantaDeMT plantaDeMT : plantasMT) {
			if (plantaDeMT.hayPlantasDeBTSinUso()) {
				return true;
			}
			
		}
		
		return false;
		
	}
	public boolean hayCentralesDeMTSinUso(){
		for (PlantaDeMT plantaDeMT : plantasMT) {
			if (plantaDeMT.getEnergiaRestante()==PlantaDeMT.Alimenta) {
				return true;
			}
			
		}
		
		return false;
		
	}
	public ArrayList<Vivienda>  obtenerClientesParaPromociones() {
		ArrayList<Vivienda> paraPromocionarles=new ArrayList<Vivienda>();
		for (PlantaDeMT plantaDeMT : plantasMT) {
			paraPromocionarles.addAll(plantaDeMT.viviendasParaPromociones());
			
		}
		return paraPromocionarles;
	}
	public ArrayList<PlantaDeMT> getPlantasMT() {
		return plantasMT;
	}
	public void addPlantaMT(PlantaDeMT plantasMT) {
		this.plantasMT.add(plantasMT);
	}
	public void addPlantaBT(PlantaDeBT plantaBT) {
		boolean insertado=false;
		
		try{
			while(!insertado){
				//la idea es iterar hasta que sepa que se inserto en algun lado revisando que entre todo lo que tenga MT no llegue a su limite si se llegara al maximo de consumo
				//insertado=
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
