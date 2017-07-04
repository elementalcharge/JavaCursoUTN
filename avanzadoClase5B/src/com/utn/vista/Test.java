package com.utn.vista;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.lib.CalculoGalactico;

//import com.lib.CalculoGa
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sin reflexion
		//CalculoGalactico cc=
		System.out.println("sin reflexion");
		CalculoGalactico cc=new CalculoGalactico();
		System.out.println("hola"+cc.sumar2Numeros2());
		//trabajando con reflexion
		System.out.println("con Reflexion");
		try {
			Class calculo= Class.forName("com.lib.CalculoGalactico");
			Object newInstance=calculo.newInstance();
			Class[] NoParam={};
			Object[] noParam={};
			//Method sumar2Numeros2= calculo.getDeclaredMethod("MetodoPrivado", NoParam );
			//sumar2Numeros2.setAccessible(true);
			//System.out.println(sumar2Numeros2.invoke(newInstance, noParam));
			//for (Parameter item : sumar2Numeros2.getParameters()) {
				//System.out.println("param: "+item);
			//}
			for (Method itemMethod : calculo.getDeclaredMethods()) {
				itemMethod.setAccessible(true);
				System.out.println(itemMethod.getName());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		DBController db=new DBController();
		
		db.insertoObjeto();
	}

}
