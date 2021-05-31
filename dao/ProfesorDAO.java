package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ro.emanuel.helpers.DBHelper;
import ro.emanuel.pojo.Profesor;


public class ProfesorDAO {

	public static Profesor getProfesorByID(int id) throws SQLException {
		String select = "select * from profesor where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Profesor result = null;
		if (rs.next()) {
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			String curs = rs.getString("curs");
			String email = rs.getString("email");
			int vechime = rs.getInt("vechime");
			result = new Profesor(id, nume,varsta,curs,email,vechime);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Profesor> getProfesorByName(String nameQuery) throws SQLException {
		String select = "select * from profesor WHERE nume LIKE ?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setString(1, '%' + nameQuery + '%');
		ResultSet rs = stmt.executeQuery();
		ArrayList<Profesor> result = new ArrayList<Profesor>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			String curs = rs.getString("curs");
			String email = rs.getString("email");
			int vechime = rs.getInt("vechime");
			result.add (new Profesor(id, nume, varsta, curs, email, vechime));
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Profesor> getProfesor() throws SQLException {

		String select = "select * from profesor";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Profesor> result = new ArrayList<Profesor>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			String curs = rs.getString("curs");
			String email = rs.getString("email");
			int vechime = rs.getInt("vechime");
			Profesor p = new Profesor(id, nume, varsta, curs, email,vechime);
			result.add(p);
		}

		DBHelper.closeConnection();
		return result;
	}

	public static void createProfesor(Profesor p) throws SQLException {
		ProfesorDAO.createProfesor(p.getNume(),p.getVarsta(), p.getCurs(), p.getEmail(), p.getVechime());
	}

	public static void createProfesor(String nume, int varsta, String curs, String email ,int vechime) throws SQLException {
		String insert = "insert into profesor (nume, varsta, curs, email, vechime) Value(?,?,?,?,?)";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(insert);

		stmt.setString(1, nume);
		stmt.setInt(2, varsta);
		stmt.setString(3, curs);
		stmt.setString(4, email);
		stmt.setInt(5, vechime);
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void updateProfesor(Profesor p) throws SQLException {
		String update = "update Profesor set nume=?, varsta=?, curs=?, email=?, vechime=? where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, p.getNume());
		stmt.setInt(2, p.getVarsta());
		stmt.setString(3, p.getCurs());
		stmt.setString(4, p.getEmail());
		stmt.setInt(5, p.getVechime());
		stmt.setInt(6, p.getId());
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void deleteProfesor(Profesor p) throws SQLException {
		ProfesorDAO.deleteProfesor(p.getId());
	}

	public static void deleteProfesor(int id) throws SQLException {
		String delete = "delete from profesor where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}

}
