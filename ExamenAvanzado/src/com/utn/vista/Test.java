package com.utn.vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utn.Controlador.Manaos;
import com.utn.conexion.ConnectionMySQL;

public class Test {
	
}
/*
 * PreparedStatement ps = (PreparedStatement) ConexionMysql.conectoMysql()
 
.prepareStatement("select * from cliente where NumCliente = ?");
ps.setInt(1, identificador);

// guardamos la tabla que viene x la base de datos
ResultSet rs = ps.executeQuery();

// Retorno el alumno cargado de la base
return new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
rs.getString("correo"));
*/