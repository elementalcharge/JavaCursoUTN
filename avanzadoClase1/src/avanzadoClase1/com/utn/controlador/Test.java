package avanzadoClase1.com.utn.controlador;

import avanzadoClase1.com.utn.modelo.Accion;
import avanzadoClase1.com.utn.modelo.Adolecente;
import avanzadoClase1.com.utn.modelo.Adult;
import avanzadoClase1.com.utn.modelo.Nino;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdultControlador ad=new AdultControlador();
		ad.guardar(new Adult());
		ad.guardar(new Adult());
		
		ninoControlador nc= new ninoControlador();
		nc.guardar(new Nino());
		
		AdolecenteControlador ac= new AdolecenteControlador();
		ac.guardar(new Adolecente());
		
		Accion a=new Accion();
		a.sumoNumeros(1, 1);
		
	}

}
