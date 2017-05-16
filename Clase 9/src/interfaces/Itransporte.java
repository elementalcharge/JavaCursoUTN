package interfaces;

import java.util.ArrayList;

import modelo.Chofer;

public interface Itransporte  {

	public double boleto();
	default public ArrayList<Chofer> cantChoferes(){
		ArrayList<Chofer> listaChofer = new ArrayList<Chofer>();
		listaChofer.add(new Chofer());
		
		
		return listaChofer;
		
	}
	
}
