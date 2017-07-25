package tp2.controlador;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tp2.conexion.ConexionBDMySQL;

import tp2.modelo.EscribirOperaciones;
import tp2.modelo.Factura;
import tp2.modelo.Hamburguesa;

public class StockController {

	private final static int almacenarcada=30;
	private static ArrayList<Factura> pedidos;
	private static ArrayList<Factura> reporte;
	public StockController() {
		super();
		this.pedidos = new ArrayList<Factura>();
		this.reporte= new ArrayList<Factura>();
	}
	public static void ActualizarStock(Factura compra) {
 
		System.out.println(pedidos.size());
		pedidos.add(compra);
		
		if (pedidos.size()>=almacenarcada) {
			EscribirOperaciones.escribir(pedidos);
			reporte.addAll(pedidos);
			pedidos.removeAll(reporte);
		}
		//Metodo sin refleccion
		try {
		Hamburguesa consumo=compra.getOrden().consumeStock();
		
		PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
				.prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
		
			ps.setInt(1, consumo.getHamburguesas());
		
		
		ps.setString(2, "HAMBURGUESAS");
		ps.executeUpdate();
		//2
		 ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
				.prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
		
			ps.setInt(1, consumo.getPapas());
		
		
		ps.setString(2, "FRENCHYS");
		ps.executeUpdate();
		
		//3
		
		 ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
					.prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			
				ps.setInt(1, consumo.getQuesos());
			
			
			ps.setString(2, "QUESOS");
			ps.executeUpdate();
		/* DESCOMENTAR DESPUES DE PROBAR	
			//4
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getCebollas());
			ps.setString(2, "CEBOLLA");
			ps.executeUpdate();
			//5
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getJugueteVaron());
			ps.setString(2, "jugueteVaron");
			ps.executeUpdate();
			//6
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getKetchup());
			ps.setString(2, "KETCHUPS");
			ps.executeUpdate();
			//7
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getMayonesa());
			ps.setString(2, "MAYONESA");
			ps.executeUpdate();
			//8
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getMoztasa());
			ps.setString(2, "MOSTAZA");
			ps.executeUpdate();
			//9
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getPanConCentenos());
			ps.setString(2, "panConCentenos");
			ps.executeUpdate();
			//10
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getPanSinCentenos());
			ps.setString(2, "panSinCentenos");
			ps.executeUpdate();
			//11
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getHuevos());
			ps.setString(2, "huevos");
			ps.executeUpdate();
			//12
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getJuegueteMujer());
			ps.setString(2, "juegueteMujer");
			ps.executeUpdate();
			//13
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getGinis());
			ps.setString(2, "ginis");
			ps.executeUpdate();
			//14
			if(consumo.getTamanoBebida()>12){
			
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql().prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
			ps.setInt(1, consumo.getTamanoBebida()/12);
			ps.setString(2, "gaseosa");
			ps.executeUpdate();
			}
			*/
			revisarAlerta();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/*try {
			Hamburguesa consumo=compra.getOrden().consumeStock();
			Class.forName("com.mysql.jdbc.Driver");
			for (Field item : Hamburguesa.class.getFields()) {
				item.setAccessible(true);
				if (!item.getName().equals("HAMBURGUESAS"))
					query += item.getName() + ",";
			//Actualizar(consumo, combo.getName());
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	}
	public static final ArrayList<Factura> getReporte() {
		return reporte;
	}
	/*
	private void Actualizar(Hamburguesa consumo, String name){
		try {
			
				PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
						.prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD-? WHERE `ITEM`=?");
				ps.setInt(1, consumo.getHamburguesas());
				
				ps.setString(2, name);
				ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}*/
	private static void revisarAlerta(){
		try {
			PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
					.prepareStatement("SELECT * FROM `Stock`");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				if (rs.getInt("cantidad")<30) {
					System.out.println("Alerta comprar mas o se comprara al faltar menos de 10"+rs.getString("item"));
				}
				if (rs.getInt("cantidad")<10) {
					comprarIngrediente(rs.getString("item"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void comprarIngrediente(String ingrediente){
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
					.prepareStatement("UPDATE `Stock` SET `CANTIDAD`=CANTIDAD+? WHERE `ITEM`=?");
			ps.setInt(1, 30);
			
			ps.setString(2, ingrediente);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
