package clase2.ava.interfaces;

import com.utn.modelo.Vehiculo;

public interface Ivehiculo<TVehiculo extends Vehiculo> {
	public TVehiculo CrearVehiculo(String tipo);
	public void muestroVehiculo(TVehiculo vehiculo);
}
