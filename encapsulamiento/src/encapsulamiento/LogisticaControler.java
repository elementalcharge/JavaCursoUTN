package encapsulamiento;

import java.util.ArrayList;

public class LogisticaControler {

	private ArrayList<Aula> listaAula;
	public void asignoMateria(Materia materia){
		
		for (Aula aula : listaAula) {
			if (aula.getCapacidad()>20 &&
				aula.getTypo().equals(TypoAula.INFORMATICA)) {
				aula.setmateria(materia);
			}
			else if (aula.getCapacidad()>20 &&
				aula.getTypo().equals(TypoAula.GESTION)&&
				aula.isDisponible()) {
				
			}
		}
		
	}
}
