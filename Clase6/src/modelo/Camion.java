package modelo;

public class Camion extends Vehiculo {

	private Boolean acoplado;
	public Boolean getAcoplado() {
		return acoplado;
	}

	public void setAcoplado(Boolean acoplado) {
		this.acoplado = acoplado;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("frenado hidraulico");
	}

}
