package avanzadoClase1.com.utn.modelo;

import java.util.List;

public interface MyGenerico<T> {
	
	public T obtener(int index) ;
	public void guardar(T objeto);
	public boolean borrar(int id);
	public boolean borrar(T tobjeto);
	public List<T> obtenerTodo();
}
