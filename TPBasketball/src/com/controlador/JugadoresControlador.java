package com.controlador;

import java.util.ArrayList;

import com.modelo.Jugador;

public class JugadoresControlador {
	private ArrayList<Jugador> lista;
	
	public void agregarJugador(Jugador jugador){
		lista.add(jugador);
	}
	public ArrayList<Jugador> devolverMejores3(){
		ArrayList<Jugador> listaADevolver= new ArrayList<Jugador>();
		Jugador comparador=new Jugador(-1, "nadie");
		
		for (int i = 0; i < 3; i++) {
			
			for (Jugador jugador : lista) {
				if(comparador.getPuntaje()<jugador.getPuntaje() && !listaADevolver.contains(jugador)){
					comparador=jugador;
				}
			}
			listaADevolver.add(comparador);
			comparador=new Jugador(-1, "nadie");
		}
		return listaADevolver;
	}
}
