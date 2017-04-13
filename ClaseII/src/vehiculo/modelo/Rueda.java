package vehiculo.modelo;

import vehiculo.enumeradores.Neumatico;
import vehiculo.enumeradores.RuedaTamano;

public class Rueda {

	private RuedaTamano tamano;
	private Neumatico neumatico;
	public Rueda(RuedaTamano tamano, Neumatico neumatico) {
		
		this.tamano = tamano;
		this.neumatico = neumatico;
	}
	
}
