package com.utn.Controlador;

import java.util.ArrayList;

import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;
import com.utn.modelo.Bebida;

public class Fabrica {

	/*
	public Bebida elaborarCola(IngredienteX X, IngredienteComun ...comuns) {
		
		
		return null;
		
	}
	*/
	public <B extends Bebida> B prepararBebidas(B bebida,int cantidad){
		System.out.println("tardo en producirse "+cantidad+"aproximadamente:"+bebida.manufacturando(cantidad)+"min");
		
		return bebida;
		
	}
}
