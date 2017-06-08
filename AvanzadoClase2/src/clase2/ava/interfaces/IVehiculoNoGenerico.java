package clase2.ava.interfaces;

import com.utn.modelo.Vehiculo;

public interface IVehiculoNoGenerico {

	public Vehiculo crearVehiculo();
	public <T extends Vehiculo>T crearVehiculoGenerico();
	public void muestroVehiculo(Vehiculo vehiculo);
	
	public<T> void muestroVehiculoNoGenerico();
	
}
