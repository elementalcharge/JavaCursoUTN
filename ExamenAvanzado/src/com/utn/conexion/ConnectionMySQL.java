package com.utn.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class ConnectionMySQL {

	private Properties prop = new Properties();
	private FileInputStream file;
	
	
	// 1) crear variable de la clase estatica
	private static ConnectionMySQL conn;
	private static Connection conexion;
	// 2) constructor privado
	private ConnectionMySQL() {
	}

	// 3) crear estrucutra de inicializacion del objeto = singleton
	public static ConnectionMySQL newInstance() {

		// 4) antes que nada preguntar si el objeto es null
		// si lo es inicializarlo
		if (conn == null) {
			conn = new ConnectionMySQL();
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
			conn= new ConnectionMySQL();
		
		
		try {
			//Class.forName("com.mysql.jbc.Driver");//estaria de forma estatica en el sistema
			conexion=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conexion;
	}



	
}