package utn.com.interfaz;

public interface IVehiculo {
	public void acelerar();
	public void frenar();
	public default void cerrar(){
		System.out.println("pip pip");
	}
	
}
