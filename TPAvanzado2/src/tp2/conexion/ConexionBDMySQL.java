package tp2.conexion;

import java.io.IOException;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

import tp2.modelo.utils.PropertiesUtils;

public class ConexionBDMySQL {

	
	

	// 1) crear variable de la clase estatica
	private static ConexionBDMySQL conn;
	private static Connection conexion;
	// 2) constructor privado
	private ConexionBDMySQL() {
	}

	// 3) crear estrucutra de inicializacion del objeto = singleton
	public static ConexionBDMySQL newInstance() {

		// 4) antes que nada preguntar si el objeto es null
		// si lo es inicializarlo
		if (conn == null) {
			conn = new ConexionBDMySQL();
			System.out.println("creo el objeto");
			System.out.println(conn);
		} else {
			System.out.println("El objeto ya esta creado");
			System.out.println(conn);

		}
		return conn;
	}

	
	public static Connection conectoMysql() throws  IOException {
		// jdk < 1.5 hay que poner esto de debajo si es 1.5 o más no es necesario
	
		if(
		conn==null)
			conn= new ConexionBDMySQL();
		
		
		try {
			//Class.forName("com.mysql.jbc.Driver");//estaria de forma estatica en el sistema
			conexion=(Connection)DriverManager.getConnection(PropertiesUtils.getInstance().getProperty("mysql.url"),"root","");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conexion;
	}
	

}
