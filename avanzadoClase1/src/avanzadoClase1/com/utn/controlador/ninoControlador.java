package avanzadoClase1.com.utn.controlador;

import java.util.ArrayList;
import java.util.List;

import avanzadoClase1.com.utn.modelo.MyGenerico;
import avanzadoClase1.com.utn.modelo.Nino;

public class ninoControlador implements MyGenerico<Nino>{

	private List<Nino> listanino;
	
	@Override
	public Nino obtener(int index) {
		// TODO Auto-generated method stub
		return listanino.get(index);
	}

	@Override
	public void guardar(Nino objeto) {
		// TODO Auto-generated method stub
		listanino.add(objeto);
	}

	public ninoControlador() {
		super();
		listanino=new ArrayList<Nino>();
	}

	@Override
	public boolean borrar(int id) {
		// TODO Auto-generated method stub
		listanino.remove(id);
		return false;
	}

	@Override
	public boolean borrar(Nino tobjeto) {
		// TODO Auto-generated method stub
		listanino.remove(tobjeto);
		return false;
	}

	@Override
	public List<Nino> obtenerTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
