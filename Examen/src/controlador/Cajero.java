package controlador;

import java.util.Scanner;

import modelo.Plus;
import modelo.Repartidor;

public class Cajero {
	private int puedeAtenderMax;
	private int atendio;
	private boolean disponible;
	
	public Cajero(int puedeAtenderMax) {
		super();
		this.puedeAtenderMax = puedeAtenderMax;
		disponible=true;
	}
	public void obtenerPedido(Repartidor personaRepartidora, int opcion){
		Scanner input= new Scanner(System.in);
		disponible=false;
		if(atendio<puedeAtenderMax){
			if (opcion==1) {
				System.out.println("pidiendo Cono escriba sabores 2 separados por enter");
				String gusto1= input.nextLine();
				String gusto2= input.nextLine();
				personaRepartidora.armarPedido(gusto1, gusto2);
				atendio++;
			}
			if (opcion==2) {
				System.out.println("pidiendo vaso de cuarto escriba 3 sabores separados por enter");
				String gusto1= input.nextLine();
				String gusto2= input.nextLine();
				String gusto3= input.nextLine();
				System.out.println("elija 1_chocolateExtra, 2_cremade vainilla otroNumero_nada");
				int plusopcional=input.nextInt();
				Plus extra;
				switch (plusopcional) {
				case 1:
					extra= Plus.CHOCOLATEfUNDIDO;
					break;
				case 2:
					 extra= Plus.CREMADEVAINILLA;
					break;
				default:
					extra= Plus.NADA;
					break;
				}
				
				
				personaRepartidora.armarPedido(gusto1, gusto2,gusto3,extra);
				atendio++;
			}
			if (opcion==3) {
				System.out.println("pidiendo kilo escriba 4 sabores separados por enter");
				String gusto1= input.nextLine();
				String gusto2= input.nextLine();
				String gusto3= input.nextLine();
				String gusto4= input.nextLine();
				System.out.println("elija 1_chocolateExtra, 2_cremade vainilla 3_almendras otroNumero_nada");
				int plusopcional=input.nextInt();
				Plus extra;
				switch (plusopcional) {
				case 1:
					extra= Plus.CHOCOLATEfUNDIDO;
					break;
				case 2:
					 extra= Plus.CREMADEVAINILLA;
					break;
				case 3:
					 extra= Plus.ALMENDRAS;
					break;
				default:
					extra= Plus.NADA;
					break;
				}
				
				
				personaRepartidora.armarPedido(gusto1, gusto2,gusto3, gusto4,extra);
				atendio++;
			}
			
		}
		
		
	}
	@Override
	public String toString() {
		return "Cajero [puedeAtenderMax=" + puedeAtenderMax + ", atendio=" + atendio + ", disponible=" + disponible
				+ "]";
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getPuedeAtenderMax() {
		return puedeAtenderMax;
	}
	public int getAtendio() {
		return atendio;
	}
 
}
