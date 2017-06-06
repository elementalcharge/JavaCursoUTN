package com.utn.excepctions;

public class ExcepcionDesControlada extends RuntimeException{
	private static final long serialVersionUID=1L;
	private String mensaje;
	public ExcepcionDesControlada(String mensaje){
		this.mensaje=mensaje;
	}
	
}
