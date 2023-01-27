package controllerDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.collegamento;

public class riammissioneDAO {
	collegamento cl = new collegamento();
	
	//QUERY INSERIMENTO ID TARTARUGA
	public void queryInsertId(String id_tartaruga) {
		try {
			cl.st.executeUpdate("INSERT INTO tartaruga VALUES ('" + id_tartaruga + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public ResultSet riammissione() throws SQLException {
        CallableStatement stmt = ((Statement) cl).getConnection().prepareCall("select c.id_cartellaclinica, c.id_tartaruga, c.luogo_ritrovamento, c.descrizione, c.data_ingresso from cartella_clinica as c join tartaruga as t on c.id_tartaruga = t.id_tartaruga where t.id_tartaruga = c.id_tartaruga;");
        return stmt.executeQuery();
    }*/
	
	public String querySelezioneCartellaRiammissione() {
		
		String stringa = "";
		try {
     // Execute the query
     String sql = "SELECT c.id_tartaruga, c.id_cartellaclinica, c.luogo_ritrovamento, c.descrizione, c.data_ingresso " +
                  "FROM cartella_clinica as c join tartaruga as t on t.id_tartaruga = c.id_tartaruga " +
                  "WHERE t.id_tartaruga = NEW.id_tartaruga::text";
     
     

     // Extract data from result set
     
     
    	ResultSet rs = cl.st.executeQuery(sql);
		while (rs.next()) {
		     stringa = "ID Tartaruga: " + rs.getString("id_tartaruga") + "\r\n"
		     + "ID Cartella Clinica: " + rs.getString("id_cartellaclinica") + "\r\n"
		     + "Luogo Ritrovamento: " + rs.getString("luogo_ritrovamento") + "\r\n"
		     + "Descrizione: " + rs.getString("descrizione") + "\r\n"
		     + "Data Ingresso: " + rs.getString("data_ingresso") + "\r\n";
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return stringa;
     }
   }


