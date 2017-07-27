package tp2.modelo;

public class Hamburguesa {
	private int HAMBURGUESAS;
	private int QUESOS;
	private int panConCentenos;
	private int panSinCentenos;
	private int huevos;
	private int CEBOLLA;
	private int KETCHUPS;
	private int MAYONESA;
	private int MOSTAZA;
	private int FRENCHYS;
	private int juegueteMujer;
	private int jugueteVaron;
	private int gaseosa;
	private int ginis;
	
	
	
	public Hamburguesa() {
		super();
		HAMBURGUESAS=0;
		QUESOS=0;
		panConCentenos=0;
		 panSinCentenos=0;
		huevos=0;
		CEBOLLA=0;
		KETCHUPS=0;
		MAYONESA=0;
		MOSTAZA=0;
		FRENCHYS=0;
		juegueteMujer=0;
		jugueteVaron=0;
		gaseosa=0;
		ginis=0;
	}
	public int getGinis() {
		return ginis;
	}
	public void setGinis(int ginis) {
		this.ginis = ginis;
	}
	@Override
	public String toString() {
		return "Hamburguesa [HAMBURGUESAS=" + HAMBURGUESAS + ", quesos=" + QUESOS + ", panConCentenos=" + panConCentenos
				+ ", panSinCentenos=" + panSinCentenos + ", huevos=" + huevos + ", cebollas=" + CEBOLLA + ", ketchup="
				+ KETCHUPS + ", mayonesa=" + MAYONESA + ", moztasa=" + MOSTAZA + ", papas=" + FRENCHYS + ", juegueteMujer="
				+ juegueteMujer + ", jugueteVaron=" + jugueteVaron + ", tamanoBebida=" + gaseosa + ", ginis="
				+ ginis + "]";
	}
	public Hamburguesa(int hamburguesas, int quesos, int panConCentenos, int panSinCentenos, int huevos, int cebollas,
			int ketchup, int mayonesa, int moztasa, int papas, int juegueteMujer, int jugueteVaron, int tamanoBebida) {
		super();
		this.HAMBURGUESAS = hamburguesas;
		this.QUESOS = quesos;
		this.panConCentenos = panConCentenos;
		this.panSinCentenos = panSinCentenos;
		this.huevos = huevos;
		this.CEBOLLA = cebollas;
		this.KETCHUPS = ketchup;
		this.MAYONESA = mayonesa;
		this.MOSTAZA = moztasa;
		this.FRENCHYS = papas;
		this.juegueteMujer = juegueteMujer;
		this.jugueteVaron = jugueteVaron;
		this.gaseosa = tamanoBebida;
	}
	public int getTamanoBebida() {
		return gaseosa;
	}
	public void setTamanoBebida(int tamanoBebida) {
		this.gaseosa = tamanoBebida;
	}
	public int getKetchup() {
		return KETCHUPS;
	}
	public void setKetchup(int ketchup) {
		this.KETCHUPS = ketchup;
	}
	public int getMayonesa() {
		return MAYONESA;
	}
	public void setMayonesa(int mayonesa) {
		this.MAYONESA = mayonesa;
	}
	public int getMoztasa() {
		return MOSTAZA;
	}
	public void setMoztasa(int moztasa) {
		this.MOSTAZA = moztasa;
	}
	public int getPapas() {
		return FRENCHYS;
	}
	public void setPapas(int papas) {
		this.FRENCHYS = papas;
	}
	public int getJuegueteMujer() {
		return juegueteMujer;
	}
	public void setJuegueteMujer(int juegueteMujer) {
		this.juegueteMujer = juegueteMujer;
	}
	public int getJugueteVaron() {
		return jugueteVaron;
	}
	public void setJugueteVaron(int jugueteVaron) {
		this.jugueteVaron = jugueteVaron;
	}
	
	public int getHamburguesas() {
		return HAMBURGUESAS;
	}
	public void setHamburguesas(int hamburguesas) {
		this.HAMBURGUESAS = hamburguesas;
	}
	public int getQuesos() {
		return QUESOS;
	}
	public void setQuesos(int quesos) {
		this.QUESOS = quesos;
	}
	public int getPanConCentenos() {
		return panConCentenos;
	}
	public void setPanConCentenos(int panConCentenos) {
		this.panConCentenos = panConCentenos;
	}
	public int getPanSinCentenos() {
		return panSinCentenos;
	}
	public void setPanSinCentenos(int panSinCentenos) {
		this.panSinCentenos = panSinCentenos;
	}
	public int getHuevos() {
		return huevos;
	}
	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}
	public int getCebollas() {
		return CEBOLLA;
	}
	public void setCebollas(int cebollas) {
		this.CEBOLLA = cebollas;
	}
	

}
