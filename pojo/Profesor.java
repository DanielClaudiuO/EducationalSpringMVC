package ro.emanuel.pojo;

public class Profesor {
	
	private int id;
	private String nume;
	private int varsta;
	private String curs;
	private String email;
	private int vechime;
	
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Profesor(int id, String nume, int varsta, String curs, String email, int vechime) {
		super();
		this.id = id;
		this.nume = nume;
		this.varsta = varsta;
		this.curs = curs;
		this.email = email;
		this.vechime = vechime;
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


	public String getCurs() {
		return curs;
	}


	public void setCurs(String curs) {
		this.curs = curs;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getVechime() {
		return vechime;
	}


	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	
	

}
