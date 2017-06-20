package utn.com.coneccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.mysql.jdbc.Connection;

public class ConexionMysql {
	//public static Connection conn=null;
	//1)crear variablñe de clase estatica
	private static ConexionMysql conn=null;
	private Properties prop= new Properties();
	FileInputStream file;
	//constructor privado
	private ConexionMysql(){
		
	}
	//singleton
	//3) crear estructura de inicializacion de objeto =singleton
	public static ConexionMysql newInstance(){
		//4) antes que nada preguntar si el objeto es null si lo es inicializarlo
		if(conn==null){
			conn = new ConexionMysql();
			System.out.println("");
		}
		return conn;
	}
	
	public static Connection conectoMysql() throws  IOException {
		// jdk < 1.5 hay que poner esto de debajo si es 1.5 o más no es necesario
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.jbc.Driver");//estaria de forma estatica en el sistema
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/olimones avanzado","root","");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	public void insertoPersona(Lenguajes idioma){
		try {
			
			 file= new FileInputStream("archivo.properties");
			prop.load(file);
			String query= prop.getProperty("insert_persona");
			System.out.println(query);
			System.out.println(prop.getProperty(idioma.getlenguaje()+"_saludo"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
