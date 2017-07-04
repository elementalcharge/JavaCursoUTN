package com.lib;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class DbComunicacion {
	String datoSensible;
	public Connection ConnectToBase() {
		try {
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public List<String>devuelvo(){
		List<String> listapersona= new ArrayList<>();
		
		listapersona.add("persona");
		listapersona.add("persona");
		listapersona.add("persona");
		listapersona.add("persona");
		return listapersona;
		
	}
	private Boolean	Insertar(String valor) {
		return false;
	}
	private void setValorSensible(String valor){
		datoSensible=valor;
	}
	public final String getDatoSensible() {
		return datoSensible;
	}
	public DbComunicacion(String datoSensible) {
		
		this.datoSensible = datoSensible;
	}
	
}

