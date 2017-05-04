package modelo;

public class VasoDeCuarto extends Pedidos{
	 private Plus agregado;
	public Plus getAgregado() {
		return agregado;
	}
	public VasoDeCuarto(String gusto1, String gusto2, String gusto3, Plus extra) {
		super(new String[] {gusto1,gusto2,gusto3});
		if (extra== Plus.CREMADEVAINILLA || extra==Plus.CHOCOLATEfUNDIDO|| extra==Plus.NADA) {
			agregado=extra;
		}
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VasoDeCuarto [agregado=" + agregado + "]";
	}

}
