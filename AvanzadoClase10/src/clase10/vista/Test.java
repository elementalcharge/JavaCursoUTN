package clase10.vista;

import clase10.modelo.Fabrica;
import clase10.modelo.FabricaDeDulceDeLeche;
import clase10.modelo.FabricaYogur;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Fabrica fl= new Fabrica();
		//FabricaDeDulceDeLeche fd= new FabricaDeDulceDeLeche();
		/*
		fl.creoLeche();
		fd.creoDulceDeLeche();
		*/
		Runnable run= new Fabrica();

		//Runnable run2= new FabricaDeDulceDeLeche();
		Thread th = new FabricaDeDulceDeLeche();
		Thread th2= new Thread(run);
		FabricaYogur fy= new FabricaYogur();
		
		//new Thread(run).start();
		th.start();
		th2.start();
		
		System.out.println(th.isAlive()+th.getName());
		fy.creoYogur((FabricaDeDulceDeLeche) th);
		synchronized (th2) {
			th2.notify();
		}
		synchronized (th) {
			th.wait();
		}
		
		/*
		th2.join();
		Thread th3= new Thread(run2);
		th3.start();
		th3.join();
		*/
		
		System.out.println("fin del programa");
	}

}
