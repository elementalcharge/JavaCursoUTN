package tp2.vista;

import tp2.controlador.StockController;
import tp2.controlador.Tienda;
import tp2.enumerables.Bebida;
import tp2.modelo.Cajero;
import tp2.modelo.Contacto;
import tp2.modelo.Factura;
import tp2.modelo.PumperFeliz;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero cj= new Cajero(true);
		System.out.println(cj.ObtenerContacto("JAMA", "lAMA"));
		cj.ingresarContacto(new Contacto("OLIMAR", "LAPIEDRA", "15DEJUNIO", "45334861"));
		StockController sc= new StockController();
		sc.ActualizarStock(new Factura(new PumperFeliz(Bebida.GASEOSA, true, true), 1000, true));
		Tienda td=new Tienda();
	}

}
