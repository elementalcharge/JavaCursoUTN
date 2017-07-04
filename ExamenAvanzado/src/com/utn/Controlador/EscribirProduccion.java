package com.utn.Controlador;

import java.io.FileWriter;

public class EscribirProduccion {
	public static void escribir(String mensaje){
		try {
			
			FileWriter fw= new FileWriter("C:\\manaos\\productionlog.txt",true);
			fw.write(mensaje);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en la escristura de produccion");
		}
	}
}
