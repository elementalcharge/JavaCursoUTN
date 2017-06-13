package utn.modelo;

public class Aventurero {
	int int1;
	String clase;
	String nombre; 
	String exp;
	String vivo;
	String skills;
	

	public int getInt1() {
		return int1;
	}


	public void setInt1(int int1) {
		this.int1 = int1;
	}


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getExp() {
		return exp;
	}


	public void setExp(String exp) {
		this.exp = exp;
	}


	public String getVivo() {
		return vivo;
	}


	public void setVivo(String vivo) {
		this.vivo = vivo;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public Aventurero(int int1, String clase, String nombre, String exp, String vivo, String skills) {
		super();
		this.int1 = int1;
		this.clase = clase;
		this.nombre = nombre;
		this.exp = exp;
		this.vivo = vivo;
		this.skills = skills;
	}


	

}
