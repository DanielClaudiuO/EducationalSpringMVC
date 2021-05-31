package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ro.emanuel.helpers.DBHelper;
import ro.emanuel.pojo.Curs;


public class CursDAO {

	public static Curs getCursByID(int id) throws SQLException {
		String select = "select * from curs where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Curs result = null;
		if (rs.next()) {
			String denumire = rs.getString("denumire");
			int credite = rs.getInt("credite");
			String sala = rs.getString("sala");
			int profesor = rs.getInt("profesor");
			result = new Curs(id, denumire,credite, sala, profesor);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Curs> getCursByName(String nameQuery) throws SQLException {
		String select = "select * from Curs WHERE denumire LIKE ?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setString(1, '%' + nameQuery + '%');
		ResultSet rs = stmt.executeQuery();
		ArrayList<Curs> result = new ArrayList<Curs>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String denumire = rs.getString("denumire");
			int credite = rs.getInt("credite");
			String sala = rs.getString("sala");
			int profesor = rs.getInt("profesor");
			result.add (new Curs(id, denumire,credite, sala, profesor));
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Curs> getCurs() throws SQLException {

		String select = "select * from Curs";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Curs> result = new ArrayList<Curs>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String denumire = rs.getString("denumire");
			int credite = rs.getInt("credite");
			String sala = rs.getString("sala");
			int profesor = rs.getInt("profesor");
			Curs c = new Curs(id, denumire,credite, sala, profesor);
			result.add(c);
		}

		DBHelper.closeConnection();
		return result;
	}

	public static void createCurs(Curs c) throws SQLException {
		CursDAO.createCurs(c.getDenumire(), c.getCredite(),c.getSala(), c.getProfesor());
	}

	public static void createCurs(String denumire, int credite, String sala, int profesor ) throws SQLException {
		String insert = "insert into Curs (denumire, credite, sala, profesor) Value(?,?,?,?)";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(insert);

		stmt.setString(1, denumire);
		stmt.setInt(2, credite);
		stmt.setString(3, sala);
		stmt.setInt(4, profesor);
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void updateCurs(Curs c) throws SQLException {
		String update = "update Curs set denumire=?, credite=?, sala=?, profesor=? where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, c.getDenumire());
		stmt.setInt(2, c.getCredite());
		stmt.setString(3, c.getSala());
		stmt.setInt(4, c.getProfesor());
		stmt.setInt(5, c.getId());
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void deleteCurs(Curs c) throws SQLException {
		CursDAO.deleteCurs(c.getId());
	}

	public static void deleteCurs(int id) throws SQLException {
		String delete = "delete from Curs where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}

}
