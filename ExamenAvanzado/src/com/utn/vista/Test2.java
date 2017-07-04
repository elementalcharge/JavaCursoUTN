package com.utn.vista;

import java.io.IOException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.utn.Controlador.Manaos;
import com.utn.Controlador.Revendedor;
import com.utn.conexion.ConnectionMySQL;
import com.utn.enumerables.IngredienteComun;
import com.utn.enumerables.IngredienteX;
import com.utn.modelo.Cola;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ConnectionMySQL conMySQL=ConnectionMySQL.newInstance();
		try {
			 Connection conn= conMySQL.conectoMysql();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Manaos m=new Manaos();
		Cola c=new Cola();
		IngredienteX X=IngredienteX.COLA;
		ArrayList<IngredienteComun> comun=new ArrayList<>();
		comun.add(IngredienteComun.ACIDOCITRICO);
		c.preparar(X, comun);
		
		Revendedor re=new Revendedor("asd", "apellido", "email", 14, 0, 3);
		
		m.RealizarPedido(c, 5, re);
		
		Revendedor r= m.ObtenerRevendor(1);
		m.RealizarPedido(c, 5, r);
		System.out.println(r);
		
		
		/*
		Manaos m=new Manaos();
		Cola c= new Cola();
		c.preparar(IngredienteX.COLA, IngredienteComun.ACEITE);
		m.RealizarPedido(c, 5, new Revendedor("asd", "zcs", "ese", 14, 0, 1));
		*/
	}

}
