package tp2.modelo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import tp2.conexion.ConexionBDMySQL;
import tp2.controlador.StockController;
import tp2.enumerables.Bebida;
import tp2.interfaces.Combo;
import tp2.modelo.utils.PropertiesUtils;

public class Cajero implements Runnable{
	public boolean EmiteTicket;
	public static int ticketsEmitidos=0;
	public static int ticketsTotales=0;
	
	public Cajero(boolean emiteTicket) {
		super();
		EmiteTicket = emiteTicket;
	}

	public Combo tomarPedido(int numpedido,Bebida paraTomar,boolean centeno,boolean jugeteVaron,boolean bebidagrande,int  ketchup,int mayonesa,int moztasa, int quesos,int huevos, int cebollas){
		Combo orden = null;
		switch (numpedido) {
		case 1:
			orden= new PumperFeliz(paraTomar, centeno, jugeteVaron);
			break;
		case 2:
			orden= new PumperMediano(paraTomar, centeno);
			break;
		case 3:
			orden= new PumperGrande(paraTomar, centeno, ketchup, mayonesa, moztasa, bebidagrande);
			break;
		case 4:
			orden= new SuperPumper(paraTomar, centeno, quesos, huevos, cebollas, ketchup, mayonesa, moztasa, bebidagrande);
			break;

		default:
			break;
		}
		
		
		return orden;
	}
	
public void ingresarContacto( Contacto cliente) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
					.prepareStatement(PropertiesUtils.getInstance().getProperty("insert.contact"));
			ps.setString(1, cliente.getNombre());
			
			ps.setString(2, cliente.getApellido());
			ps.setString(3, cliente.getNacimiento());
			ps.setString(4, cliente.getTelefono());
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
	
public Contacto ObtenerContacto(String nombre, String apellido ) {
	Contacto r = null;
	try {
		
		
			Class.forName("com.mysql.jdbc.Driver");
		
		PreparedStatement ps = (PreparedStatement) ConexionBDMySQL.conectoMysql()
				.prepareStatement(PropertiesUtils.getInstance().getProperty("select.contact"));
		ps.setString(1, nombre);
		ps.setString(2, apellido);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		r= new Contacto(rs.getString("NOMBRE"),rs.getString("APELLIDO"),rs.getString("NACIMIENTO"),rs.getString("TELEFONO"));
			
		
		
		
		
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
public void atender() {
	Combo orden=tomarPedido(2, Bebida.GASEOSA, true, false, true, 1, 1, 1, 1, 1, 1);
	Factura fact=new Factura(orden, orden.costo(), EmiteTicket);
	StockController.ActualizarStock(fact);
	ticketsTotales++;
	if (EmiteTicket) {
		ticketsEmitidos++;
	}
}
	@Override
	public void run() {
		System.out.println("abriendo caja");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("caja Abierta");
		ingresarContacto(new Contacto("tamal", "ijado", "12DeJunio", "4526643234"));
		if((ticketsEmitidos/(ticketsTotales+1))*100>60 || EmiteTicket)
		{
			atender();

		}
		else{
			
			System.out.println("Caja inhabilitada por favor vaya a otra caja");
		}
	
	}
}
