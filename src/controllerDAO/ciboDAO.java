package controllerDAO;

import java.sql.SQLException;

import DAO.collegamento;


public class ciboDAO {

	collegamento cl = new collegamento();
	
	// TARGHETTA RIAMMISSIONE--------------------------------------------------------------------------------------------------------------------------
	public void queryStatisticheCibo(String tipo_cibo, String cibo_totale, String cibo_mangiato, String numero_vasca) {
		try {
			cl.st.executeUpdate("INSERT INTO vasca VALUES ('','" + tipo_cibo + "','" + cibo_totale + "','" + cibo_mangiato + "','" + numero_vasca + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
