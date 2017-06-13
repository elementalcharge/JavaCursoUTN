package utn.vista;

import utn.com.exceptions.EscriboLog;
import utn.com.exceptions.ExceptionController;
import utn.com.exceptions.MyExeption;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EscriboLog.escribir("palabras");
		ExceptionController EC= new ExceptionController();
		/*try {
			EC.excepcionControlada();
		} catch (MyExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	EC.excepcionNoControlada();
	}

}
