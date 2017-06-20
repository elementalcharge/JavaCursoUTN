package utn.com.coneccion;

public enum Lenguajes {
	//solo se puede devolver un tipo de datos 
	//elujan bien
EN("en"),
ES("es"),
ERROR("error 404");
	//si cuando la llaman no le ponen el get devuelve el nombre de la etiqueta 
	private Lenguajes(String lengua){
		this.lenguaje=lengua;
	}
	private final String lenguaje;
	
	public String getlenguaje(){
		return lenguaje;
	}

}
