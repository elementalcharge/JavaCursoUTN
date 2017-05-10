package controlador;

import java.io.FileWriter;

public class MiExcepcion extends Exception {
	private String mensaje;
	private static final long serialVersionUID=1L;
	public MiExcepcion(String mensaje){
		super(mensaje);
		this.mensaje=mensaje;
	}
	public void guardoErrorDeArchivo(){
		try {
			FileWriter fw=new FileWriter("logError.txt");
			fw.write("Error: "+mensaje+" ");
			fw.flush();//guarda y libera la memoria
			fw.close();
		} catch (Exception e) {
			System.out.println("no se pudo crear el archivo de error");
			// TODO: handle exception
		}
	}
}
