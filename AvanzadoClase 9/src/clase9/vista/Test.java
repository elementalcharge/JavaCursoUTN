package clase9.vista;

import java.awt.event.ItemEvent;
import java.lang.reflect.Field;

import clase9.interfaces.Validacion;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class objClass= Class.forName("clase9.controlador.sumController");
		
		Field[] allfields= objClass.getDeclaredFields();
		
		for (Field item : allfields) {
			
			System.out.println(((Validacion)item.getAnnotation(Validacion.class)));
			int val=((Validacion)item.getAnnotation(Validacion.class).);
			
		}

	}

}
