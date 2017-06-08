package com.utn.modelo;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConexionMSQL {
public void conexionDB(){
	try {
		//conexion = mysql:jdbc://servidor:puerto/baseDeDatos o esquema
		Connection cBDMSQL=(Connection)DriverManager.getConnection("mysql:jdbc://localhost/utnavanzado","root","");
		Statement st= (Statement)cBDMSQL.createStatement();
		st.execute("Select * from personas");
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
