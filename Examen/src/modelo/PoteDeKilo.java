package modelo;

public class PoteDeKilo extends Pedidos {
	private Plus agregado;
	@Override
	public String toString() {
		return "PoteDeKilo [agregado=" + agregado + "]";
	}
	public Plus getAgregado() {
		return agregado;
	}
	public PoteDeKilo(String gusto1, String gusto2, String gusto3, String gusto4, Plus extra) {
		super(new String[] {gusto1,gusto2,gusto3,gusto4});
		
			agregado = extra;
	}
	
}
