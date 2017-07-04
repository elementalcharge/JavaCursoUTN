package com.utn.modelo;

import java.util.ArrayList;

import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;
import com.utn.interfaces.Manufacturable;

public abstract class Bebida implements Manufacturable{
	private int tiempoEstimadoParaProducirse;
	public final int getTiempoEstimadoParaProducirse() {
		return tiempoEstimadoParaProducirse;
	}
	public Bebida(int tiempoEstimadoParaProducirse) {
		
		this.tiempoEstimadoParaProducirse = tiempoEstimadoParaProducirse;
	}
	public final void setTiempoEstimadoParaProducirse(int tiempoEstimadoParaProducirse) {
		this.tiempoEstimadoParaProducirse = tiempoEstimadoParaProducirse;
	}
	public abstract void preparar(IngredienteX X, ArrayList<IngredienteComun> comun);
	protected void procesos(){
		System.out.println("agregarBicarbonato");
		System.out.println("agitar 10min");
		System.out.println("reposando");
		System.out.println("embotellado");
		
	}
	public abstract  IngredienteX getIngredienteEspecial();
	public abstract ArrayList<IngredienteComun> getOtros();
}
