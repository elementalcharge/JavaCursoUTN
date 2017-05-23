package controlador;

import java.util.ArrayList;

import modelo.Animal;
import modelo.Medico;
import modelo.Veterinaria;

public class MedicoControlador {

	
	//Animal pacientes;
	private Veterinaria vet;
	private ArrayList<Animal> animalesPacientes;
	public MedicoControlador(Veterinaria vet) {
		this.vet = vet;
		this.animalesPacientes=new ArrayList<Animal>();
	}
	public ArrayList<Animal> getAnimalesPacientes() {
		return animalesPacientes;
	}
	public void addAnimalesPacientes(Animal mascota) {
		animalesPacientes.add(mascota);
	}
	public Veterinaria getVet() {
		return vet;
	}
	public void atenderAnimal(Animal mascota){
		vet.atenderAnimal(mascota);
		
	}
	public ArrayList<Animal> atenderCola(){
		for (Animal animal : animalesPacientes) {
			vet.atenderAnimal(animal);
		}
		return animalesPacientes;
	}
	
	
}
