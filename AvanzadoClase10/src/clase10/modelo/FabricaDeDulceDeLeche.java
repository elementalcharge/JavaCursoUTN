package clase10.modelo;

import java.nio.channels.Pipe.SinkChannel;

public class FabricaDeDulceDeLeche extends Thread {

	public void creoDulceDeLeche() {
		synchronized(this){
			try{
				System.out.println("fabrico dulce de leche");
				Thread.sleep(2000);
				
				System.out.println("se fabrico dulce de leche");
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public void  pasteurizado() {
		synchronized (this) {
			
			System.out.println("pasteurizando...");
			try {
				Thread.sleep(1000);
				notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("pasteurizado");
			
		}
	}
	@Override
	public void run() {
		creoDulceDeLeche();
	}
}
