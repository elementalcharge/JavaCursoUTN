package Vista;

import controlador.Heladeria;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heladeria pepe=new Heladeria();
		pepe.agregarEmpleadosRepartidor("mauela");
		pepe.agregarEmpleadosRepartidor("consuela");
		pepe.agregarEmpleadosRepartidor("olimar");
		pepe.agregarEmpleadosRepartidor("osvaldo");
		pepe.tomarPedido();
		pepe.tomarPedido();
		pepe.tomarPedido();
		pepe.tomarPedido();
		
		System.out.println(pepe);
	}

}
