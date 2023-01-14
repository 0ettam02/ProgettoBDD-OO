package controllerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.collegamento;
import progetto_bd_oo.cartella_clinica;

public class viewCartellaClinicaDAO {
	collegamento cl = new collegamento();
	
	// QUERY SELEZIONE CARTELLA
		// CLINICA--------------------------------------------------------------------------------------------------------------------------
		public ArrayList <String> querySelezioneCartellaClinica(String id_cartellaClinica) {
			
			ArrayList<cartella_clinica> listaCartellaClinica = new ArrayList();
			ArrayList <String> descrizioneCartelleCliniche = new ArrayList<>();
			
			cartella_clinica temp;
			
			try {
				String sql = "SELECT id_cartellaclinica, C.nome_tartaruga AS NomeTart, info_specie, lunghezza, larghezza, peso, luogo_ritrovamento, data_liberazione, data_accesso, data_decesso, descrizione, T.id_tartaruga AS TID\r\n"
						+ "FROM cartella_clinica AS C JOIN tartaruga AS T ON C.id_tartaruga = T.id_tartaruga WHERE id_cartellaclinica = '" + id_cartellaClinica + "'";
				ResultSet rs = cl.st.executeQuery(sql);

				while (rs.next()) {
					temp = new cartella_clinica(rs.getString("id_cartellaclinica"),
							rs.getString("NomeTart"), rs.getString("info_specie"), rs.getString("luogo_ritrovamento"),
							rs.getString("data_liberazione"), rs.getString("data_accesso"), rs.getString("data_decesso"),
							rs.getString("descrizione"), rs.getString("TID"), rs.getDouble("lunghezza"),
							rs.getDouble("larghezza"), rs.getDouble("peso"));
					
					listaCartellaClinica.add(temp);
					
					descrizioneCartelleCliniche.add(temp.toString());
					
					System.out.println(rs.getString("id_cartellaclinica"));
				}

				cl.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
			return descrizioneCartelleCliniche;

		}

}
