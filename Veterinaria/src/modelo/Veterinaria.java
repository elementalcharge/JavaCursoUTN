package modelo;

public class Veterinaria {

	final int maxAtiendeVeterinaria=20;
	int atendidosVeterinaria;
	Medico[] medicos;
	public Veterinaria( Medico[] medicos) {
		
		this.atendidosVeterinaria = 0;
		this.medicos = medicos;
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
		for (int i = 0; i < medicos.length; i++) {
			if (medicos[i].atendidosEnElDia<medicos[idDelMedico].atendidosEnElDia) {
				idDelMedico=i;
			}
		}
		return medicos[idDelMedico];
	}
	
	private void nuevoDia(){
		atendidosVeterinaria=0;
		for (Medico medico : medicos) {
			medico.nuevoDia();
		}
	}
	
}
