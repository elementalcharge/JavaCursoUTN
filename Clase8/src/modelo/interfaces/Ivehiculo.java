package modelo.interfaces;

import modelo.Motor;

public interface Ivehiculo {
	public final String nombre="Vehiculo";

	public abstract boolean encender(Motor motor);
	public boolean encender();
	public void  frenar (double canMetros);
	public void frenar();
	public String direccion();
	public boolean retroceder();
	public default void transportar(){
		System.out.println("te movi");
	}
	
}
