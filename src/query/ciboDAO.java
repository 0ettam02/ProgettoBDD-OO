package query;

import java.sql.SQLException;

import GUImedico.collegamento;


public class ciboDAO {

	collegamento cl = new collegamento();
	
	public void queryStatisticheCibo(String tipo_cibo, String cibo_totale, String cibo_mangiato, String numero_vasca) {
		try {
			cl.st.executeUpdate("INSERT INTO vasca VALUES ('','" + tipo_cibo + "','" + cibo_totale + "','" + cibo_mangiato + "','" + numero_vasca + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
}
