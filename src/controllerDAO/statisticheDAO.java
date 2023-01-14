package controllerDAO;

import java.sql.SQLException;

import DAO.collegamento;

public class statisticheDAO {
	collegamento cl = new collegamento();
	
	// QUERY INSERIMENTO
		// STATISTICHE--------------------------------------------------------------------------------------------------------------------------
		public void queryInsertStatistiche(String id_statistica, String numer_tartarughe_tot, String numer_tartarughe_lib,
				String numer_tartarughe_curate, String numer_tartarughe_malate, String numer_tartarughe_dec,
				String data_inizio, String data_fine) {
			try {
				cl.st.executeUpdate("INSERT INTO statistiche VALUES ('" + id_statistica + "','" + numer_tartarughe_dec
						+ "','" + numer_tartarughe_lib + "','" + numer_tartarughe_curate + "','" + numer_tartarughe_malate
						+ "','" + numer_tartarughe_dec + "','" + data_inizio + "','" + data_fine + "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
