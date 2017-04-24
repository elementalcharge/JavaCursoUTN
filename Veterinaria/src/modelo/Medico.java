package modelo;

public class Medico {
	int atendidosEnElDia;
	final static int maxAtendidos=5;
	
	public Revision Atender(Animal animal) {
		if (atendidosEnElDia<maxAtendidos) {
			atendidosEnElDia++;
			return new Revision("algo tiene", "algo le doy");
				
		}
		else {
			return null;
		}
	}

	public int getAtendidos() {
		return atendidosEnElDia;
	}

	public void nuevoDia() {
		atendidosEnElDia = 0;
	}

	public static int getMaxatendidos() {
		return maxAtendidos;
	}
	
}
