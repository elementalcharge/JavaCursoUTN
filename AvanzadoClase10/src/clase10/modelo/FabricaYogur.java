package clase10.modelo;

public class FabricaYogur {

	
	boolean yogur=false;
	public void creoYogur(FabricaDeDulceDeLeche th) {
		
		synchronized (th) {
			System.out.println("creando yogur");
			try {
				Thread.sleep(5000);
				yogur=true;
				System.out.println("yogur creado");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
