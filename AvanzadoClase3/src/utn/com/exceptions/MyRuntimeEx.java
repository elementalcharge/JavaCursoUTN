package utn.com.exceptions;

import java.io.FileWriter;

public class MyRuntimeEx extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mensaje;
	public MyRuntimeEx(String mensaje){
		this.mensaje=mensaje;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		try {
			
			FileWriter fw= new FileWriter("log.txt",true);
			fw.write(mensaje);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en el error XD");
		}
		return super.getMessage();
	}

}
