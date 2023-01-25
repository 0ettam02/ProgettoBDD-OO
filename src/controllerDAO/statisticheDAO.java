package controllerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.collegamento;

public class statisticheDAO {
	collegamento cl = new collegamento();
	
	// QUERY INSERIMENTO
		// STATISTICHE--------------------------------------------------------------------------------------------------------------------------
		public void queryInsertStatistiche(String data_inizio, String data_fine) {
			try {
				cl.st.executeUpdate("INSERT INTO statistiche VALUES ('s0001',null ,null,null, '" + data_inizio + "','" + data_fine + "', '0')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
				// QUERY NUMERO TARTARUGHE TOTALI IN UN LASSO DI TEMPO
				public String queryNumeroTartarugheTotali(String data_inizio, String data_fine){
				    try {
				        String sql = "SELECT COUNT(cartella_clinica.data_ingresso) as count_ingresso\r\n"
				                + " FROM cartella_clinica JOIN statistiche ON statistiche.costante = cartella_clinica.costante\r\n"
				                + "WHERE cartella_clinica.data_ingresso BETWEEN '"+data_inizio+"' AND '"+data_fine+"'";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}
				
				// QUERY NUMERO TARTARUGHE MORTE IN UN LASSO DI TEMPO
				public String queryNumeroTartarugheMorte(String data_inizio, String data_fine){
				    try {
				        String sql = "SELECT COUNT(DISTINCT vita_tartarughe.data_morte) as count_morte\r\n"
				                + " FROM vita_tartarughe JOIN statistiche ON statistiche.costante = vita_tartarughe.costante\r\n"
				                + "WHERE vita_tartarughe.data_morte BETWEEN '"+data_inizio+"' AND '"+data_fine+"'";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}
				
				// QUERY NUMERO TARTARUGHE LIBERATE IN UN LASSO DI TEMPO
				public String queryNumeroTartarugheLiberate(String data_inizio, String data_fine){
				    try {
				        String sql = "SELECT COUNT(DISTINCT vita_tartarughe.data_liberazione) as count_liberazione\r\n"
				                + " FROM vita_tartarughe JOIN statistiche ON statistiche.costante = vita_tartarughe.costante\r\n"
				                + "WHERE vita_tartarughe.data_liberazione BETWEEN '"+data_inizio+"' AND '"+data_fine+"'";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}

}
