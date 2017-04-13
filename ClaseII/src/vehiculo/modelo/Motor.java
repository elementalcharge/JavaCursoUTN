package vehiculo.modelo;

import vehiculo.enumeradores.TipoCombustible;

public class Motor {
 private TipoCombustible combustible;
 private Caja caja;
 private String serial;
 public Motor(TipoCombustible gasoil, Caja caja) {
	
	this.combustible = gasoil;
	this.caja = caja;
	
}

public void ensender() {
	System.out.println("wryyyyyyyyy");
}
}
