package avanzadoClase1.com.utn.controlador;

import java.util.ArrayList;
import java.util.List;

import avanzadoClase1.com.utn.modelo.Adult;
import avanzadoClase1.com.utn.modelo.MyGenerico;

public class AdultControlador implements MyGenerico<Adult> {
	private List<Adult> listaAdulto;

	
	public AdultControlador() {
		super();
		this.listaAdulto = new ArrayList<Adult>();
	}

	@Override
	public Adult obtener(int index) {
		// TODO Auto-generated method stub
		
		return listaAdulto.get(index);
	}

	@Override
	public void guardar(Adult objeto) {
		// TODO Auto-generated method stub
		this.listaAdulto.add(objeto);
	}

	@Override
	public boolean borrar(int id) {
		// TODO Auto-generated method stub
		listaAdulto.remove(id);
		return false;
	}

	@Override
	public boolean borrar(Adult tobjeto) {
		// TODO Auto-generated method stub
		listaAdulto.remove(tobjeto);
		return false;
	}

	@Override
	public List<Adult> obtenerTodo() {
		// TODO Auto-generated method stub
		return listaAdulto;
	}
	
}
