package tp2.modelo;

public class Hamburguesa {
	private int HAMBURGUESAS;
	private int quesos;
	private int panConCentenos;
	private int panSinCentenos;
	private int huevos;
	private int cebollas;
	private int ketchup;
	private int mayonesa;
	private int moztasa;
	private int papas;
	private int juegueteMujer;
	private int jugueteVaron;
	private int tamanoBebida;
	private int ginis;
	
	
	
	public Hamburguesa() {
		super();
		HAMBURGUESAS=0;
		quesos=0;
		panConCentenos=0;
		 panSinCentenos=0;
		huevos=0;
		cebollas=0;
		ketchup=0;
		mayonesa=0;
		moztasa=0;
		papas=0;
		juegueteMujer=0;
		jugueteVaron=0;
		tamanoBebida=0;
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
		return "Hamburguesa [HAMBURGUESAS=" + HAMBURGUESAS + ", quesos=" + quesos + ", panConCentenos=" + panConCentenos
				+ ", panSinCentenos=" + panSinCentenos + ", huevos=" + huevos + ", cebollas=" + cebollas + ", ketchup="
				+ ketchup + ", mayonesa=" + mayonesa + ", moztasa=" + moztasa + ", papas=" + papas + ", juegueteMujer="
				+ juegueteMujer + ", jugueteVaron=" + jugueteVaron + ", tamanoBebida=" + tamanoBebida + ", ginis="
				+ ginis + "]";
	}
	public Hamburguesa(int hamburguesas, int quesos, int panConCentenos, int panSinCentenos, int huevos, int cebollas,
			int ketchup, int mayonesa, int moztasa, int papas, int juegueteMujer, int jugueteVaron, int tamanoBebida) {
		super();
		this.HAMBURGUESAS = hamburguesas;
		this.quesos = quesos;
		this.panConCentenos = panConCentenos;
		this.panSinCentenos = panSinCentenos;
		this.huevos = huevos;
		this.cebollas = cebollas;
		this.ketchup = ketchup;
		this.mayonesa = mayonesa;
		this.moztasa = moztasa;
		this.papas = papas;
		this.juegueteMujer = juegueteMujer;
		this.jugueteVaron = jugueteVaron;
		this.tamanoBebida = tamanoBebida;
	}
	public int getTamanoBebida() {
		return tamanoBebida;
	}
	public void setTamanoBebida(int tamanoBebida) {
		this.tamanoBebida = tamanoBebida;
	}
	public int getKetchup() {
		return ketchup;
	}
	public void setKetchup(int ketchup) {
		this.ketchup = ketchup;
	}
	public int getMayonesa() {
		return mayonesa;
	}
	public void setMayonesa(int mayonesa) {
		this.mayonesa = mayonesa;
	}
	public int getMoztasa() {
		return moztasa;
	}
	public void setMoztasa(int moztasa) {
		this.moztasa = moztasa;
	}
	public int getPapas() {
		return papas;
	}
	public void setPapas(int papas) {
		this.papas = papas;
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
		return quesos;
	}
	public void setQuesos(int quesos) {
		this.quesos = quesos;
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
		return cebollas;
	}
	public void setCebollas(int cebollas) {
		this.cebollas = cebollas;
	}
	

}
