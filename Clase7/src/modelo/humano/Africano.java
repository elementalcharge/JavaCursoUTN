package modelo.humano;

public class Africano extends Humano {

	private int granValor;
	public Africano(String nombre, int edad, String id, int granValor) {
		super(nombre, edad, id);
		this.granValor=granValor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("OWO owa negro taka mucho");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agarrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agarrar(String objeto) {
		// TODO Auto-generated method stub
		
	}

}
