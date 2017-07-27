package tp2.controlador;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Field;

import tp2.conexion.ConexionBDMySQL;

import tp2.modelo.EscribirOperaciones;
import tp2.modelo.Factura;
import tp2.modelo.Hamburguesa;
import tp2.modelo.utils.PropertiesUtils;

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
 
		//System.out.println(pedidos.size());
		pedidos.add(compra);
		
		if (pedidos.size()>=almacenarcada) {
			EscribirOperaciones.escribir(pedidos);
			reporte.addAll(pedidos);
			pedidos.removeAll(reporte);
		}
		//Metodo sin refleccion
		try {
		Hamburguesa consumo=compra.getOrden().consumeStock();
		Object objeto =consumo;
		Class<?> clase = objeto.getClass();
		java.lang.reflect.Field campo = null;
		PreparedStatement psnombreDelCampo = (PreparedStatement) ConexionBDMySQL.conectoMysql()
				.prepareStatement(PropertiesUtils.getInstance().getProperty("select.stock.all"));
		ResultSet result= psnombreDelCampo.executeQuery();
		while (result.next()) {
			try {
				
				
				campo=clase.getDeclaredField(result.getString("ITEM"));
				campo.setAccessible(true);
				int valueOfAttribute = (int) campo.get(objeto);
				PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
						.prepareStatement(PropertiesUtils.getInstance().getProperty("update.stock.consume"));
				
				ps.setInt(1, valueOfAttribute);
				ps.setString(2, result.getString("ITEM"));
				
				ps.executeUpdate();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
			revisarAlerta();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public static final ArrayList<Factura> getReporte() {
		return reporte;
	}
	
	private static void revisarAlerta(){
		try {
			PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
					.prepareStatement(PropertiesUtils.getInstance().getProperty("select.stock.all"));
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
					.prepareStatement(PropertiesUtils.getInstance().getProperty("update.stock.restock"));
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
