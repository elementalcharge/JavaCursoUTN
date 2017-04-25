package encapsulamiento;

import java.util.ArrayList;

public class Aula {
	private int capacidad;
	private TypoAula typo;
	private boolean disponible;
	private int piso;
	private String nombre;
	private ArrayList<Materia> listamateria;
	public int getCapacidad() {
		return capacidad;
	}
	public TypoAula getTypo() {
		return typo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public int getPiso() {
		return piso;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Materia> getListamateria() {
		return listamateria;
	}
	public void setmateria(Materia materia) {
		listamateria.add(materia);
	}
	public Aula(int capacidad, TypoAula typo, boolean disponible, int piso, String nombre,
			ArrayList<Materia> listamateria) {
	
		this.capacidad = capacidad;
		this.typo = typo;
		this.disponible = disponible;
		this.piso = piso;
		this.nombre = nombre;
		this.listamateria = new ArrayList<Materia>();
	}
	
}
