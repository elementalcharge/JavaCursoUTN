package com.utn.Controlador;

import java.io.FileWriter;

public class EscribirLogistica {

	public static void escribir(String mensaje){
		try {
			
			FileWriter fw= new FileWriter("C:\\manaos\\logistic.txt",true);
			fw.write(mensaje);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en la escritura de logistica");
		}
	}
}
