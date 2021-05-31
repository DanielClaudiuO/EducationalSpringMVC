package ro.emanuel.pojo;

public class Student {
	
	private int id;
	private String nume;
	private int varsta;
	private double medie;
	private String facultate;
	private int promotie;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String nume, int varsta, double medie, String facultate, int promotie) {
		super();
		this.id = id;
		this.nume = nume;
		this.varsta = varsta;
		this.medie = medie;
		this.facultate = facultate;
		this.promotie = promotie;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public int getVarsta() {
		return varsta;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public double getMedie() {
		return medie;
	}


	public void setMedie(double medie) {
		this.medie = medie;
	}


	public String getFacultate() {
		return facultate;
	}


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}


	public int getPromotie() {
		return promotie;
	}


	public void setPromotie(int promotie) {
		this.promotie = promotie;
	}


	
}