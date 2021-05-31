package ro.emanuel.pojo;

import java.sql.Date;

public class Prezenta {
	private int id;
	private Date data;
	private String curs;
	private String profesor;
	private int prezenta;
	
	public Prezenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prezenta(int id, Date data, String curs, String profesor, int prezenta) {
		super();
		this.id = id;
		this.data = data;
		this.curs = curs;
		this.profesor = profesor;
		this.prezenta = prezenta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCurs() {
		return curs;
	}
	public void setCurs(String curs) {
		this.curs = curs;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public int getPrezenta() {
		return prezenta;
	}
	public void setPrezenta(int prezenta) {
		this.prezenta = prezenta;
	}

	
	
}
