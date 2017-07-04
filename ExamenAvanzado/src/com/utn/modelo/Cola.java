package com.utn.modelo;

import java.util.ArrayList;

import com.utn.Controlador.EscribirProduccion;
import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;

public class Cola extends Bebida{
	IngredienteX ingredienteEspecial;
	ArrayList<IngredienteComun> otros;

	public Cola() {
		super(30);
		this.ingredienteEspecial = null;
		this.otros = new ArrayList<IngredienteComun>();
	}

	public final IngredienteX getIngredienteEspecial() {
		return ingredienteEspecial;
	}

	public final void setIngredienteEspecial(IngredienteX ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}

	public final ArrayList<IngredienteComun> getOtros() {
		return otros;
	}

	public final void setOtros(ArrayList<IngredienteComun> otros) {
		this.otros = otros;
	}

	@Override
	public String toString() {
		return "Cola [ingredienteEspecial=" + ingredienteEspecial + ", otros=" + otros + "]";
	}

	@Override
	public void preparar(IngredienteX X, ArrayList<IngredienteComun> comuns) {
		// TODO Auto-generated method stub
		procesos();
		ingredienteEspecial=X;
		otros.addAll(otros);
		EscribirProduccion.escribir("creado Bebida"+this.getClass()+"ingredientes:"+this+"tardo: 25min");
		
		
	}

	@Override
	public int manufacturando(int unidades) {
		// TODO Auto-generated method stub
		return unidades*this.getTiempoEstimadoParaProducirse();
	}


}
