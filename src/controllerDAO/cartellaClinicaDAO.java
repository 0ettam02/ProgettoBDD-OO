package controllerDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.collegamento;

public class cartellaClinicaDAO {
	collegamento cl = new collegamento();



	// QUERY
	// ID TARTARUGA--------------------------------------------------------------------------------------------------------------------------
	public void queryIdTartaruga(String id_tartaruga) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// INSERT CARTELLA CLINICA--------------------------------------------------------------------------------------------------------------------------
	public void queryInsertCartellaClinica(String id_cartellaClinica, String id_tartaruga, String nome, String info_specie,
			double lunghezza, double larghezza, double peso, String luogo_ritrovamento, String descrizione,
			String data) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
			Connection con = DriverManager.getConnection(url, "postgres", "matteo");
			System.out.println("Connessione OK \n");

			PreparedStatement st = con.prepareStatement("INSERT INTO cartella_clinica VALUES(?,?,?,?,?,?,?,?,?,'" + data + "',?)");
			st.setString(1, id_cartellaClinica);
			st.setString(2, id_tartaruga);
			st.setString(3, nome);
			st.setString(4, info_specie);
			st.setDouble(5, lunghezza);
			st.setDouble(6, larghezza);
			st.setDouble(7, peso);
			st.setString(8, luogo_ritrovamento);
			st.setString(9, descrizione);
			st.setString(10, id_tartaruga);

			int x = st.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// INSERT CARTELLA CLINICA RICERCATORE--------------------------------------------------------------------------------------------------------------------------
		public void queryInsertCartellaClinicaRicercatore(String id_cartellaClinica, String id_tartaruga, String nome,String luogo_ritrovamento,String data) {
			try {
				Class.forName("org.postgresql.Driver");
				String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
				Connection con = DriverManager.getConnection(url, "postgres", "matteo");
				System.out.println("Connessione OK \n");

				PreparedStatement st = con.prepareStatement("INSERT INTO cartella_clinica VALUES(?,?,?,?," + null + "," + null + "," + null + ",?,?,'" + data + "',?)");
				st.setString(1, id_cartellaClinica);
				st.setString(2, id_tartaruga);
				st.setString(3, nome);
				st.setString(4, "");
				st.setString(5, luogo_ritrovamento);
				st.setString(6, "");
				st.setString(7, id_tartaruga);

				int x = st.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}
