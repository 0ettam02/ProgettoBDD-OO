package controllerDAO;

import java.sql.SQLException;

import DAO.collegamento;

public class accessoDAO {
	
	collegamento cl = new collegamento();
	
	// QUERY
		// TARGHETTA--------------------------------------------------------------------------------------------------------------------------
		public void queryTarghetta(String id_tartaruga,boolean targhetta) {
			try {
				cl.st.executeUpdate("INSERT INTO tartaruga VALUES ('" + id_tartaruga + "','','1','" + targhetta + "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
