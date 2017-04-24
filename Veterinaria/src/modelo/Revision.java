package modelo;

public class Revision {

	String causa;
	String medicamento;
	public Revision(String causa, String medicamento) {
		super();
		this.causa = causa;
		this.medicamento = medicamento;
	}
	public String getCausa() {
		return causa;
	}
	public String getMedicamento() {
		return medicamento;
	}

	public void tratamiento() {
		System.out.println("Causa: "+ "tratarlo con:"+ medicamento);
	}
}
