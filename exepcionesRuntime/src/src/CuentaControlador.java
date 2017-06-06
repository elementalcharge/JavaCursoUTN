package src;

import com.utn.excepctions.ExcepcionDesControlada;

public class CuentaControlador {
	int saldo=10;
	public void extraigoDinero() {
		if (saldo <0) {
			throw new ExcepcionDesControlada("se cierra el sistema");
		}
		else {
			System.out.println("retiro x dinero");
		}
	}
}
