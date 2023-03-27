package query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import GUImedico.collegamento;

public class primoAccessoDAO {
	
	collegamento cl = new collegamento();
	
	public void queryInsertNumeroVasca(String NumeroVacsa) {
		try {
			cl.st.executeUpdate("INSERT INTO vasca(numero_vasca) VALUES ('" + NumeroVacsa + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void queryIdTartaruga(String id_tartaruga) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/clone";
			Connection con = DriverManager.getConnection(url, "postgres", "matteo");
			System.out.println("Connessione OK \n");

			PreparedStatement st = con.prepareStatement("INSERT INTO tartaruga VALUES(?,?,?,?,?)");
			st.setString(1, id_tartaruga);
			st.setString(2, "");
			st.setString(3, "");
			st.setBoolean(4, false);
			st.setString(5, id_tartaruga);

			int x = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
