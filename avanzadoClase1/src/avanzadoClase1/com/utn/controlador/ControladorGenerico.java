package avanzadoClase1.com.utn.controlador;

import java.util.ArrayList;
import java.util.List;

import avanzadoClase1.com.utn.modelo.MyGenerico;

public class ControladorGenerico implements MyGenerico<Object>{

	List<Object> listaDeObjetos;

	

	

	@Override
	public void guardar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean borrar(Object tobjeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(int id) {
		// TODO Auto-generated method stub
		listaDeObjetos.remove(id);
		return true;
	}

	@Override
	public List<Object> obtenerTodo() {
		// TODO Auto-generated method stub
		return listaDeObjetos;
	}

	public ControladorGenerico() {
		super();
		listaDeObjetos=new ArrayList<Object>();
	}

	@Override
	public Object obtener(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
