package modelo;

public class Chofer {
	public String nombre;
	public String linea;
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	@Override
	public String toString() {
		return "Chofer [nombre=" + nombre + ", linea=" + linea + "]";
	}
	
}
