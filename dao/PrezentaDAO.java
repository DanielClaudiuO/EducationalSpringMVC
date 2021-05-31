package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import ro.emanuel.helpers.DBHelper;
import ro.emanuel.pojo.Prezenta;


public class PrezentaDAO {

	public static Prezenta getPrezentaByID(int id) throws SQLException {
		String select = "select * from prezenta where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Prezenta result = null;
		if (rs.next()) {
			Date data = rs.getDate("data");
			String curs = rs.getString("curs");
			String profesor = rs.getString("profesor");
			int prezenta = rs.getInt("prezenta");
			result = new Prezenta(id, data, curs, profesor,prezenta);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Prezenta> getPrezentaByName(String nameQuery) throws SQLException {
		String select = "select * from prezenta WHERE data LIKE ?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setString(1, '%' + nameQuery + '%');
		ResultSet rs = stmt.executeQuery();
		ArrayList<Prezenta> result = new ArrayList<Prezenta>();
		while (rs.next()) {
			int id = rs.getInt("id");
			Date data = rs.getDate("data");
			String curs = rs.getString("curs");
			String profesor = rs.getString("profesor");
			int prezenta = rs.getInt("prezenta");
			result.add (new Prezenta(id, data, curs, profesor,prezenta));
		}
		DBHelper.closeConnection();
		return result;
	}

	public static ArrayList<Prezenta> getPrezenta() throws SQLException {

		String select = "select * from prezenta";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Prezenta> result = new ArrayList<Prezenta>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			Date data = rs.getDate("data");
			String curs = rs.getString("curs");
			String profesor = rs.getString("profesor");
			int prezenta = rs.getInt("prezenta");
			Prezenta p = new Prezenta(id, data, curs, profesor,prezenta);
			result.add(p);
		}

		DBHelper.closeConnection();
		return result;
	}

	public static void createPrezenta(Prezenta c) throws SQLException {
		PrezentaDAO.createPrezenta(c.getData(),c.getCurs(), c.getProfesor(), c.getPrezenta());
	}

	public static void createPrezenta(Date data, String curs, String profesor, int prezenta ) throws SQLException {
		String insert = "insert into prezenta (data, curs, profesor, prezenta) Value(?,?,?,?)";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(insert);

		stmt.setDate(1, data);
		stmt.setString(2, curs);
		stmt.setString(3, profesor);
		stmt.setInt(4, prezenta);
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void updatePrezenta(Prezenta c) throws SQLException {
		String update = "update prezenta set data=?, curs=?, profesor=?, prezenta=? where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setDate(1, c.getData());
		stmt.setString(2, c.getCurs());
		stmt.setString(3, c.getProfesor());
		stmt.setInt(4, c.getPrezenta());
		stmt.setInt(5, c.getId());
		stmt.executeUpdate();
		DBHelper.closeConnection();

	}

	public static void deletePrezenta(Prezenta c) throws SQLException {
		PrezentaDAO.deletePrezenta(c.getId());
	}

	public static void deletePrezenta(int id) throws SQLException {
		String delete = "delete from prezenta where id=?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}

}
