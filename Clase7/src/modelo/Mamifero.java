package modelo;

public abstract class Mamifero {

	private int cantPatas;
	public abstract void comer();
	
	public void mamar() {
		System.out.println("Estoy mamando");
	}
	public abstract void agarrar();
	public abstract void agarrar(String objeto);
	
}
