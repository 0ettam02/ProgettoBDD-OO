package controllerDAO;

import java.sql.SQLException;

import DAO.collegamento;

public class cartellaClinicaDAO {
	collegamento cl = new collegamento();

	// QUERY INSERIMENTO CARTELLA
		// CLINICA--------------------------------------------------------------------------------------------------------------------------
		public void queryInsertCartella(String id_cartella, String tartaruga, String nome_tartaruga, String info_specie,
				String lunghezza, String larghezza, String peso, String luogo_ritrovamento, String descrizione,
				String data_liberazione, String data_accesso, String data_decesso) {
			try {
				cl.st.executeUpdate("INSERT INTO cartella_clinica VALUES ('" + id_cartella + "','" + tartaruga + "','"
						+ nome_tartaruga + "','" + info_specie + "','" + lunghezza + "','" + larghezza + "','" + peso
						+ "','" + luogo_ritrovamento + "','" + descrizione + "','" + data_liberazione + "','" + data_accesso
						+ "','" + data_decesso + "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		// QUERY INSERIMENTO
		// TARTARUGA--------------------------------------------------------------------------------------------------------------------------
		public void queryInsertIdTartaruga(String id_tartaruga, String nome_tartaruga, boolean targhetta) {
			try {
				cl.st.executeUpdate("INSERT INTO tartaruga VALUES ('" + id_tartaruga + "','" + nome_tartaruga + "','"
						+ targhetta + "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}		
}
