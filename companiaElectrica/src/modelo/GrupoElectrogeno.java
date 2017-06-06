package modelo;

import interfaces.Respaldador;

public class GrupoElectrogeno implements Respaldador {
	int KvOfrecidos;
	@Override
	public int ofrece() {
		// TODO Auto-generated method stub
		return KvOfrecidos;
	}
	public GrupoElectrogeno(int kvOfrecidos) {
		super();
		KvOfrecidos = kvOfrecidos;
	}
	
}
