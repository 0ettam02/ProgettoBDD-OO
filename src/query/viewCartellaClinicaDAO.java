package query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import GUImedico.collegamento;
import entità.cartella_clinica;

public class viewCartellaClinicaDAO {
	collegamento cl = new collegamento();
	
	
		public ArrayList <String> querySelezioneCartellaClinica(String id_cartellaClinica) {
			
			ArrayList<cartella_clinica> listaCartellaClinica = new ArrayList<>();
			ArrayList <String> descrizioneCartelleCliniche = new ArrayList<>();
			
			cartella_clinica temp;
			
			try {
				String sql = "SELECT id_cartellaclinica, C.nome_tartaruga AS NomeTart, info_specie, lunghezza, larghezza, peso, luogo_ritrovamento, descrizione, C.id_tartaruga AS CID, data_ingresso\r\n"
						+ "FROM cartella_clinica AS C WHERE id_cartellaclinica = '" + id_cartellaClinica + "'";
				ResultSet rs = cl.st.executeQuery(sql);

				while (rs.next()) {
					temp = new cartella_clinica(rs.getString("id_cartellaclinica"),
							rs.getString("NomeTart"), rs.getString("info_specie"), rs.getString("luogo_ritrovamento"),
							rs.getString("descrizione"), rs.getString("CID"), rs.getString("data_ingresso"),
							rs.getDouble("larghezza"), rs.getDouble("peso"), rs.getDouble("lunghezza"));
					
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
