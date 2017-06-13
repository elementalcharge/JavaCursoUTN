package utn.modelo;

import java.util.List;

public interface Iparty<T> {


	public T obtenerPorIdentificador(int identificador);
	
	public List<T> obtenerTodosLosRegistros();
	
	public void agregarRegistro(T tobjeto);
	
	public boolean borroRegistro(int identificador);
	
	public void modificoRegistroPorIdentificador(int identificador);

	
}
