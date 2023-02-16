package query;

import java.sql.SQLException;

import GUImedico.collegamento;

public class esitoTartarugheDAO {
	
	collegamento cl = new collegamento();
	
			public void queryDataLiberazione(String id_tartaruga, String data_liberazione) {
				try {
					cl.st.executeUpdate("INSERT INTO vita_tartarughe VALUES ('" + id_tartaruga + "','" + data_liberazione + "',null)");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
						public void queryDataMorte(String id_tartaruga, String data_morte) {
							try {
								cl.st.executeUpdate("INSERT INTO vita_tartarughe VALUES ('" + id_tartaruga + "',null,'" + data_morte + "')");
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}

}
