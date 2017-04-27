package modelo;

public class Moto extends Vehiculo{

	private boolean manubrio;
	private double velMax;
	public boolean isManubrio() {
		return manubrio;
	}
	public void setManubrio(boolean manubrio) {
		this.manubrio = manubrio;
	}
	public double getVelMax() {
		return velMax;
	}
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("freno a campana");
	}
	@Override
	public String toString() {
		return "Moto [manubrio=" + manubrio + ", velMax=" + velMax + "]"+ super.toString();
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("encender");
	}

}
