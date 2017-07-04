package com.utn.modelo;

import java.util.ArrayList;

import com.utn.Controlador.EscribirProduccion;
import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;

public class Alcolica extends Bebida {
	IngredienteX ingredienteEspecial;
	ArrayList<IngredienteComun> otros;

	public Alcolica() {
		super(30);
		this.setTiempoEstimadoParaProducirse(getTiempoEstimadoParaProducirse()+10);
		this.ingredienteEspecial = null;
		this.otros = new ArrayList<IngredienteComun>();
	}

	@Override
	public void preparar(IngredienteX X, ArrayList<IngredienteComun> comuns) {
		// TODO Auto-generated method stub
		procesos();
		ingredienteEspecial=X;
		otros.addAll(otros);
		System.out.println("inyectando alcohol");
		EscribirProduccion.escribir("creado Bebida"+this.getClass()+"tardo: 30min");
		
	}

	@Override
	public IngredienteX getIngredienteEspecial() {
		// TODO Auto-generated method stub
		return ingredienteEspecial;
	}

	@Override
	public ArrayList<IngredienteComun> getOtros() {
		// TODO Auto-generated method stub
		return otros;
	}

	@Override
	public int manufacturando(int unidades) {
		return unidades*this.getTiempoEstimadoParaProducirse();
		// TODO Auto-generated method stub
		
	}
}
