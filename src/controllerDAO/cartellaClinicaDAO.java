package controllerDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.collegamento;

public class cartellaClinicaDAO {
	collegamento cl = new collegamento();

	// QUERY INSERIMENTO CARTELLA
	// CLINICA--------------------------------------------------------------------------------------------------------------------------
	public void queryInsertCartella(String id_cartella, String tartaruga, String nome_tartaruga, String info_specie,
			String lunghezza, String larghezza, String peso, String luogo_ritrovamento, String descrizione,
			String data_ingresso) {
		try {
			cl.st.executeUpdate("INSERT INTO cartella_clinica VALUES ('" + id_cartella + "','" + tartaruga + "','"
					+ nome_tartaruga + "','" + info_specie + "','" + lunghezza + "','" + larghezza + "','" + peso
					+ "','" + luogo_ritrovamento + "','" + descrizione + "','" + data_ingresso + "', 0)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	// QUERY
	// TARGHETTA--------------------------------------------------------------------------------------------------------------------------
	public void queryIdTartaruga(String id_tartaruga) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
			Connection con = DriverManager.getConnection(url, "postgres", "matteo");
			System.out.println("Connessione OK \n");

			PreparedStatement st = con.prepareStatement("INSERT INTO tartaruga VALUES(?,?,?,?,?,?)");
			st.setString(1, id_tartaruga);
			st.setString(2, "");
			st.setString(3, "");
			st.setBoolean(4, false);
			st.setInt(5, 0);
			st.setString(6, id_tartaruga);

			int x = st.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TARGHETTA--------------------------------------------------------------------------------------------------------------------------
	public void queryTarghetta(String id_cartellaClinica, String id_tartaruga, String nome, String info_specie,
			double lunghezza, double larghezza, double peso, String luogo_ritrovamento, String descrizione,
			String data) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
			Connection con = DriverManager.getConnection(url, "postgres", "matteo");
			System.out.println("Connessione OK \n");

			PreparedStatement st = con.prepareStatement("INSERT INTO cartella_clinica VALUES(?,?,?,?,?,?,?,?,?,'" + data + "',?,?)");
			st.setString(1, id_cartellaClinica);
			st.setString(2, id_tartaruga);
			st.setString(3, nome);
			st.setString(4, info_specie);
			st.setDouble(5, lunghezza);
			st.setDouble(6, larghezza);
			st.setDouble(7, peso);
			st.setString(8, luogo_ritrovamento);
			st.setString(9, descrizione);
			st.setInt(10, 0);
			st.setString(11, id_tartaruga);

			int x = st.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
