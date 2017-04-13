package vehiculo.controlador;

import vehiculo.enumeradores.Frenos;
import vehiculo.enumeradores.Modulo;
import vehiculo.enumeradores.Neumatico;
import vehiculo.enumeradores.RuedaTamano;
import vehiculo.enumeradores.TipoCaja;
import vehiculo.enumeradores.TipoCombustible;
import vehiculo.modelo.Auto;
import vehiculo.modelo.Caja;
import vehiculo.modelo.Combustible;
import vehiculo.modelo.Motor;
import vehiculo.modelo.Rueda;

public class FabricoAuto {
	public FabricoAuto() {
		// TODO Auto-generated constructor stub
	Caja cajaManual = new Caja(TipoCaja.MANUAL, 6);
	Motor motorAGas= new Motor(TipoCombustible.GASOIL, cajaManual);
	Rueda rueda= new Rueda(RuedaTamano.GRANDE,Neumatico.LISA);
	Auto AutoGas= new Auto(motorAGas,rueda,new Caja(TipoCaja.MANUAL, 5),Modulo.PCM, Frenos.CAMPANA);
	
	} 
}
