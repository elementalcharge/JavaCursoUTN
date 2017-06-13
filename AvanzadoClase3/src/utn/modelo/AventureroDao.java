package utn.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import conexion.ConexionMysql;
import utn.com.exceptions.EscriboLog;

public class AventureroDao implements Iparty<Aventurero> {

	//private ConexionMysql conn;
	


	@Override
	public Aventurero obtenerPorIdentificador(int identificador) {
		// TODO Auto-generated method stub
		Aventurero aven= null;
		try {
			PreparedStatement ps= (PreparedStatement)
					ConexionMysql.conectoMysql().
					prepareStatement("select * from aventureros where id=?");
					ps.setInt(1, identificador);
					ResultSet rs= ps.executeQuery();
					
					aven= new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills"));
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aven;
	}

	@Override
	public List<Aventurero> obtenerTodosLosRegistros() {
		List<Aventurero> aven= new ArrayList<Aventurero>();
		try {
			PreparedStatement ps= (PreparedStatement)
					ConexionMysql.conectoMysql().
					prepareStatement("select * from aventureros");
					
					ResultSet rs= ps.executeQuery();
					
					aven.add( new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills")));
					while (rs.next()) {
						aven.add( new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills")));
							
					}
			
		} catch (Exception e) {
			// TODO: handle exception
			EscriboLog.escribir("Mi tabla esta Herida");
			
			EscriboLog.escribir(e.getMessage());
			
		}
		return aven;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void agregarRegistro(Aventurero tobjeto) {
		// TODO Auto-generated method stub
		List<Aventurero> aven= new ArrayList<Aventurero>();
		try {
			PreparedStatement ps= (PreparedStatement)
					ConexionMysql.conectoMysql().
					prepareStatement("insert into aventureros(clase, nombre, exp,vivo,skills)");
					ps.setString(1, tobjeto.getClase());
					ps.setString(2, tobjeto.getNombre());
					ps.setString(3, tobjeto.getExp());
					ps.setString(4, tobjeto.getVivo());
					ps.setString(5, tobjeto.getSkills());
					
					
					ResultSet rs= ps.executeQuery();
					
					aven.add( new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills")));
					while (rs.next()) {
						aven.add( new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills")));
							
					}
			
		} catch (Exception e) {
			// TODO: handle exception
			EscriboLog.escribir("Mi tabla esta Herida");
			
			EscriboLog.escribir(e.getMessage());
			
		}
		
		
	}

	@Override
	public boolean borroRegistro(int identificador) {
		// TODO Auto-generated method stub
		Aventurero aven= null;
		try {
			PreparedStatement ps= (PreparedStatement)
					ConexionMysql.conectoMysql().
					prepareStatement("select * from aventureros where id=?");
					ps.setInt(1, identificador);
					ResultSet rs= ps.executeQuery();
					
					aven= new Aventurero(rs.getInt("ID"),rs.getString("clase"),rs.getString("nombre"),rs.getString("exp"),rs.getString("vivo"),rs.getString("skills"));
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void modificoRegistroPorIdentificador(int identificador) {
		// TODO Auto-generated method stub
		
	}

}
