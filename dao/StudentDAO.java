package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ro.emanuel.helpers.DBHelper;
import ro.emanuel.pojo.Student;


public class StudentDAO {

	public static Student getStudentByID(int id) throws SQLException {
		String select = "select * from student where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Student result = null;
		if (rs.next()) {
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			double medie = rs.getDouble("medie");
			String facultate = rs.getString("facultate");
			int promotie=rs.getInt("promotie");
			result = new Student(id, nume, varsta, medie,facultate,promotie);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Student> getStudentByName(String nameQuery) throws SQLException {
		String select = "select * from student WHERE nume LIKE ?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setString(1, '%' + nameQuery + '%');
		ResultSet rs = stmt.executeQuery();
		ArrayList<Student> result = new ArrayList<Student>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			double medie = rs.getDouble("medie");
			String facultate = rs.getString("facultate");
			int promotie=rs.getInt("promotie");
			result.add (new Student(id, nume, varsta, medie,facultate,promotie));
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Student> getStudent() throws SQLException {

		String select = "select * from student";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Student> result = new ArrayList<Student>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			int varsta = rs.getInt("varsta");
			double medie = rs.getDouble("medie");
			String facultate = rs.getString("facultate");
			int promotie=rs.getInt("promotie");
			Student s = new Student(id, nume, varsta, medie,facultate,promotie);
			result.add(s);
		}

		DBHelper.closeConnection();
		return result;
	}

	public static void createStudent(Student s) throws SQLException {
		StudentDAO.createStudent(s.getNume(), s.getVarsta(),s.getMedie(), s.getFacultate(),s.getPromotie());
	}

	public static void createStudent(String nume, int varsta, double medie ,String facultate,int promotie) throws SQLException {
		String insert = "insert into student (nume, varsta, medie, facultate, promotie) Value(?,?,?,?,?)";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(insert);

		stmt.setString(1, nume);
		stmt.setInt(2, varsta);
		stmt.setDouble(3, medie);
		stmt.setString(4, facultate);
		stmt.setInt(5, promotie);
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void updateStudent(Student s) throws SQLException {
		String update = "update Student set nume=?, varsta=?, medie=?, facultate=?, promotie=? where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, s.getNume());
		stmt.setInt(2, s.getVarsta());
		stmt.setDouble(3, s.getMedie());
		stmt.setString(4, s.getFacultate());
		stmt.setInt(5, s.getPromotie());
		stmt.setInt(6, s.getId());
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void deleteStudent(Student s) throws SQLException {
		StudentDAO.deleteStudent(s.getId());
	}

	public static void deleteStudent(int id) throws SQLException {
		String delete = "delete from student where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}

}
