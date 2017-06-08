package clase2.vista;

import com.utn.controlador.SerializadorControlador;
import com.utn.controlador.VehiculoControlador;
import com.utn.controlador.VehiculoNogenericoControlador;
import com.utn.modelo.Magia;
import com.utn.modelo.Vehiculo;
import com.utn.modelo.VehiculoElectrico;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculoControlador vc= new VehiculoControlador();
		VehiculoNogenericoControlador vngc= new VehiculoNogenericoControlador();
		Magia m= new Magia();
		vc.CrearVehiculo("electrico");
		vngc.crearVehiculoGenerico();
		vngc.muestroVehiculo(new VehiculoElectrico());
		vngc.muestroVehiculoNoGenerico();
		Object objetoElectrico=m.invasionV(VehiculoElectrico.class);
		SerializadorControlador sc=new SerializadorControlador();
		sc.serializoObjeto(new VehiculoElectrico("jamon","patente","marca"));
		System.out.println(sc.deserializar());
	}

}
