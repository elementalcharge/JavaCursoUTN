package utn.com.exceptions;

import java.io.FileWriter;

public class EscriboLog {


	public static void escribir(String mensaje){
		try {
			
			FileWriter fw= new FileWriter("log.txt",true);
			fw.write(mensaje);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en el error XD");
		}
	}
}
