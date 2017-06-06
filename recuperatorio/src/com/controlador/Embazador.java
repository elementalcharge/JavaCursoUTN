package com.controlador;

import java.util.ArrayList;

import com.abtractos.Bebida;
import com.enumerador.Ingrediente;
import com.enumerador.IngredienteX;
import com.interfaz.Pedido;

public class Embazador {
	public Pedido EmbazarBebida(){
		return null;
	}
	
	public Pedido embazarFernet(){
		Fernet bebida= new Fernet();
		return bebida;
	}
	private Bebida armarBebida(IngredienteX sabor,ArrayList<Ingrediente>comunes ){
		agregarBicarbonato();
		agitar();
		reposo();
		if (sabor==IngredienteX.FERNET) {
			injectarAlcohol();
		}
		embazar();
		return null;
		
	}
	private void embazar() {
		// TODO Auto-generated method stub
		System.out.println("la botella la tapo");
	}

	private void injectarAlcohol() {
		// TODO Auto-generated method stub
		System.out.println("BORRACHO");
	}

	private void reposo() {
		System.out.println("a dormir");
	}

	private void agregarBicarbonato(){
		System.out.println("agrego bicarbonato");
	}
	private void agitar() {
		System.out.println("bate que bate!!");
	}
}
