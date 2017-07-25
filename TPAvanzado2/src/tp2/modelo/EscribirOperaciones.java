package tp2.modelo;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;

public class EscribirOperaciones {

	public static void escribir(ArrayList<Factura> pedidos){
		try {
			
			FileWriter fw= new FileWriter("C:\\pumper\\compras\\compra"+Calendar.DAY_OF_MONTH+""+Calendar.MONTH+""+Calendar.YEAR+".txt",true);
			fw.write(pedidos.toString());
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error en la escristura de produccion");
		}
	}
}
