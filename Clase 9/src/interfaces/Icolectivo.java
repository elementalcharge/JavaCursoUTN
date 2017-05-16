package interfaces;

public interface Icolectivo extends Itransporte{

	public void recorrido();
	public double recorrido(double distancia);
	public int cantMaxPasajeros();
	public int precioBoleto();
	public String frecuencia();
	public String linea();
	
}
