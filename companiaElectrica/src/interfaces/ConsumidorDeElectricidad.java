package interfaces;

import java.util.ArrayList;

import modelo.Vivienda;

public interface ConsumidorDeElectricidad {
	public int consume();
	public int sobra();
	public ArrayList<Vivienda> clientesParaPromociones();
}
