package conexion;

import java.sql.DriverManager;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.mysql.jdbc.Connection;

public class ConexionMysql {
	//public static Connection conn=null;
	public static Connection conectoMysql() {
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
}
