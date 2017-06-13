package utn.com.exceptions;

public class ExceptionController {

	
	public void excepcionNoControlada(){
		throw new MyRuntimeEx("Esto se descontrolo!");
	}
	public void excepcionControlada() throws MyExeption{
		
		throw new MyExeption("Alto ahi!");
		
	}
}
