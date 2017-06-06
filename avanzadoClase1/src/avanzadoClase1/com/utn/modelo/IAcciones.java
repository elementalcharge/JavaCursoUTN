package avanzadoClase1.com.utn.modelo;

public interface IAcciones {
	public <T,U>void sumoNumeros(T numeroUno, U numerodos) ;
	//debe ser overideado si o si este
	public <T> T devuelvoT();
	//este debe devolver el objeto T
	public <T>T tT(T t);
}
