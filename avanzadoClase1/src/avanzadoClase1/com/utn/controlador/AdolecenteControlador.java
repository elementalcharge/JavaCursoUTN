package avanzadoClase1.com.utn.controlador;

import java.util.ArrayList;
import java.util.List;

import avanzadoClase1.com.utn.modelo.Adolecente;
import avanzadoClase1.com.utn.modelo.MyGenerico;

public class AdolecenteControlador implements MyGenerico<Adolecente> {
	private List<Adolecente> listaAdolecente;
	@Override
	public Adolecente obtener(int index) {
		// TODO Auto-generated method stub
		return listaAdolecente.get(index);
	}

	@Override
	public void guardar(Adolecente objeto) {
		// TODO Auto-generated method stub
		listaAdolecente.add(objeto);
	}

	@Override
	public boolean borrar(int id) {
		// TODO Auto-generated method stub
		listaAdolecente.remove(id);
		return false;
	}

	@Override
	public boolean borrar(Adolecente tobjeto) {
		// TODO Auto-generated method stub
		listaAdolecente.remove(tobjeto);
		return false;
	}

	@Override
	public List<Adolecente> obtenerTodo() {
		// TODO Auto-generated method stub
		
		return listaAdolecente;
	}

	public AdolecenteControlador() {
		super();
		listaAdolecente=new ArrayList<Adolecente>();
	}

}
