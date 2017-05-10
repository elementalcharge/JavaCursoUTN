package modelo.humano;

public class Latino extends Humano {

	private boolean sabeIngles;
	private boolean sabeChamullar;
	@Override
	public void razonar() {
		// TODO Auto-generated method stub
		if (sabeIngles) {
			System.out.println("im thinking");
		}
		else {
			super.razonar();	
		}
		
	}
	public Latino(String nombre, int edad, String id, boolean sabeIngles, boolean sabeChamullar) {
		super(nombre, edad, id);
		this.sabeChamullar=sabeChamullar;
		this.sabeIngles=sabeIngles;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
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
