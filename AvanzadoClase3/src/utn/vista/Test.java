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
/*
 * PreparedStatement ps = (PreparedStatement) ConexionMysql.conectoMysql()
 
.prepareStatement("select * from alumnox where id = ?");
ps.setInt(1, identificador);

// guardamos la tabla que viene x la base de datos
ResultSet rs = ps.executeQuery();

// Retorno el alumno cargado de la base
return new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
rs.getString("correo"));
*/