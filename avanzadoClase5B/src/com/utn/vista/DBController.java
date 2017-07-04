package com.utn.vista;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DBController {

	public void insertoObjeto() {
		//obtenenos la clase DBComunication con reflection
		try {
			
			
			Class com=Class.forName("com.lib.DBComunicacion");//trae la clase de otro proyecto que esta dentro del .jar
			
			Class[] paramParaConstructor={String.class};
			//trabajo con el constructor
			Constructor cons=com.getConstructor(paramParaConstructor);
			Object[] valores={String.class}; 
			
			Object newInstanceOfCom= com.newInstance();
			
			//trabajar con los metodos tenemos que utilizar la clas 
			//Method
			Class[]params={};
			Method metodoDeCom= com.getDeclaredMethod("devuelvo", params );
			
			Class[] param={String.class};
			Method insertar= com.getDeclaredMethod("Insertar", param);
			Method setDato= com.getDeclaredMethod("setValorSensible", param);
			
			insertar.setAccessible(true);
			//le paso el valor de los parametros y lo ejecuto
			//Se debe pasar la instancia previamente creada de la clase que se esta trabajando
			
			//1.1) creo el valor del argumento para pasarle al metodo
			Object[] valores={"modifico el valor sensible"};
			//ejecuto el metodo
			setDato.invoke(newInstanceOfCom,valores);
			Method obtener= com.getDeclaredMethod("getDatoSensible", params);
			Object dato=obtener.invoke(newInstanceOfCom, params);
			System.out.println(dato);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
