package avanzadoClase1.com.utn.modelo;

public class Accion implements IAcciones{

	@Override
	public <T, U> void sumoNumeros(T numeroUno, U numerodos) {
		// TODO Auto-generated method stub
		int res=((int) numeroUno)+((int) numerodos);
		System.out.println(res);
	}
	

	@Override
	public <T> T tT(T t) {
		// TODO Auto-generated method stub
		
		return t;
	}


	@Override
	public <T> T devuelvoT() {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}
