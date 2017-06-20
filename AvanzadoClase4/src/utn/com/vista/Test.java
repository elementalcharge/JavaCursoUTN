package utn.com.vista;

import com.utn.dao.Auto;

import utn.com.coneccion.ConexionMysql;
import utn.com.coneccion.Lenguajes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionMysql m0= ConexionMysql.newInstance();
		ConexionMysql m1= ConexionMysql.newInstance();
		ConexionMysql m2= ConexionMysql.newInstance();
		ConexionMysql m3= ConexionMysql.newInstance();
		m0.insertoPersona(Lenguajes.ES);
		final Auto a1= new Auto(false, 4);
		Auto a2=a1;
		a2=new Auto(true, 4);
		
	}

}
