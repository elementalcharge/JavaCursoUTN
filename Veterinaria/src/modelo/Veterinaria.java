package modelo;

import java.util.ArrayList;

public class Veterinaria {

	public final int maxAtiendeVeterinaria=20;
	private int atendidosVeterinaria;
	private	ArrayList<Medico> medicos;
	public Veterinaria( ) {
		
		this.atendidosVeterinaria = 0;
		this.medicos = new ArrayList<Medico>();
	}
	
	public Revision atenderAnimal(Animal mascota) {
		if (atendidosVeterinaria<20) {
			Medico doctor= encontrarMedicoMaslibre();
			atendidosVeterinaria++;
			return doctor.Atender(mascota);
		}
		return null;
	}
	private Medico encontrarMedicoMaslibre() {
		int idDelMedico=0;
		for (int i = 0; i < medicos.size(); i++) {
			if (medicos.get(i).atendidosEnElDia<medicos.get(idDelMedico).atendidosEnElDia) {
				idDelMedico=i;
			}
		}
		return medicos.get(idDelMedico);
	}
	
	public void nuevoDia(){
		atendidosVeterinaria=0;
		for (Medico medico : medicos) {
			medico.nuevoDia();
		}
	}
	
}
