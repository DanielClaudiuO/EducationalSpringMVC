package ro.emanuel.pojo;

public class Curs {
	private int id;
	private String denumire;
	private int credite;
	private String sala;
	private int profesor;
	
	
	public Curs() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Curs(int id, String denumire, int credite, String sala, int profesor) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.credite = credite;
		this.sala = sala;
		this.profesor = profesor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public int getCredite() {
		return credite;
	}


	public void setCredite(int credite) {
		this.credite = credite;
	}


	public String getSala() {
		return sala;
	}


	public void setSala(String sala) {
		this.sala = sala;
	}


	public int getProfesor() {
		return profesor;
	}


	public void setProfesor(int profesor) {
		this.profesor = profesor;
	}
	
	
}
