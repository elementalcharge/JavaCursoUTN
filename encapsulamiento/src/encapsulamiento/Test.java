package encapsulamiento;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> listaDeAlgo= new ArrayList<Object>();
		listaDeAlgo.add(new Ejemplos());
		for (Object object : listaDeAlgo) {
			if(object instanceof Ejemplos){
				Ejemplos nuevoObjeto=(Ejemplos) object;
				
			}
		}
		ArrayList listaDeObject= new ArrayList<>();
		listaDeObject.add(12);
		listaDeObject.add("jamoncito");
		//listaDeObject.add(listaDeAlgo);
		//listaDeObject.add(null);
		listaDeObject.add(5+6);
		listaDeObject.add(new Materia("astronomus","de lunes a jamones XD"));
		listaDeObject.add(12);
		listaDeObject.add(12);
		listaDeObject.add(12);
		for (Object object : listaDeObject) {
			if(object instanceof Materia)
			{
				Materia mat=(Materia)object;
				System.out.println(mat);
			}
			else {
				System.out.println(object.toString());
				
			}
			
			
			
		}
	}

}
