package utn.com.exceptions;

import java.io.FileWriter;

public class MyExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensaje;
	public MyExeption(String mensaje){
		this.mensaje=mensaje;
	}
	
	@Override
	public String getMessage() {
		try {
			
			FileWriter fw= new FileWriter("log.txt",true);
			fw.write(mensaje);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en el error XD");
		}
		finally {
			
		}
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
}
