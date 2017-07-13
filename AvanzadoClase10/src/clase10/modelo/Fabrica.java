package clase10.modelo;

public class Fabrica implements Runnable {

	public void creoLeche() {
		try{
			System.out.println("fabrico leche");
			Thread.sleep(4000);
			
			System.out.println("se fabrico leche");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void  pasteurizado() {
		System.out.println("pasteurizando...");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("pasteurizado");
	}
	//es como el main del thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		creoLeche();
		pasteurizado();
	}
}
