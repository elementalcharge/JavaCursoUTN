package com.utn.Controlador;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.utn.conexion.ConnectionMySQL;
import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;
import com.utn.modelo.Bebida;

public class Manaos {
	Fabrica planta;
	double embazadosEnElDia;
	final static int minimo=100;
	final static double maximo=70000;
	
	
	public Manaos() {
		super();
		this.planta = new Fabrica();
		}

	public <B extends Bebida> void RealizarPedido(B pedido, int cantidad, Revendedor cliente) {
		
		EscribirLogistica.escribir("Bebida"+pedido.getClass()+" cantidad:"+ cantidad+" Cliente"+cliente);
		
			planta.prepararBebidas(pedido,cantidad);
			
		
		cliente.setBebidasCompradas(cantidad+cliente.getBebidasCompradas());
		actualizarBebidasCompradasenBD(cliente);
		
		
	}
	
	private void actualizarBebidasCompradasenBD( Revendedor cliente) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			PreparedStatement ps = (PreparedStatement) ConnectionMySQL.conectoMysql()
					.prepareStatement("UPDATE `Cliente` SET `CantidadDeBebidasCompradas`=? WHERE `NumCliente`=?");
			ps.setInt(1, cliente.getBebidasCompradas());
			
			ps.setInt(2, cliente.getNumCliente());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	public Revendedor ObtenerRevendor(int numcliente) {
		Revendedor r = null;
		try {
			
			
				Class.forName("com.mysql.jdbc.Driver");
			
			PreparedStatement ps = (PreparedStatement) ConnectionMySQL.conectoMysql()
					.prepareStatement("SELECT * FROM `Cliente` WHERE `NumCliente`=?");
			ps.setInt(1, numcliente);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			r= new Revendedor(rs.getString("Nombre"),rs.getString("Apellido"),rs.getString("Email"),rs.getInt("Correo"),rs.getInt("CantidadDeBebidasCompradas"),rs.getInt("NumCliente"));
				
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return r;
		
	}
	
}
