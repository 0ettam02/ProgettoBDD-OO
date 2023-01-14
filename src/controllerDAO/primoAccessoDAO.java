package controllerDAO;

import java.sql.SQLException;

import DAO.collegamento;

public class primoAccessoDAO {
	
	collegamento cl = new collegamento();
	
	//QUERY INSERIMENTO
	// VASCA--------------------------------------------------------------------------------------------------------------------------
	public void queryInsertNumeroVasca(String NumeroVacsa, String id_vasca) {
		try {
			cl.st.executeUpdate("INSERT INTO NumeroVasca VALUES ('" + NumeroVacsa + "','" + id_vasca + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
