package query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import GUImedico.collegamento;
import entità.tartaruga;

public class riammissioneDAO {
	collegamento cl = new collegamento();
	
	
	
	public DefaultTableModel VisualizzazioneIdTartaruga() {
		DefaultTableModel modello = new DefaultTableModel();
		modello.addColumn("ID TARTARUGA");
		modello.addColumn("ID CARTELLA CLINICA");
		try {
			String queryLogin = "select c.id_tartaruga, c.id_cartellaclinica from cartella_clinica as c order by c.data_ingresso";

			cl.st.getConnection().createStatement();
			ResultSet rsLogin = cl.st.executeQuery(queryLogin);
			
			while (rsLogin.next()) {

				modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2)}); 								
			}

			cl.close();
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return modello;
	}
	
	
	
		public String queryIdCartellaClinica(String idtartaruga) {
			
			String risultato = new String();

	        try {
	            String queryLogin = "SELECT c.id_cartellaclinica FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
	                                                                                                        
	            Statement statementQueryLogin = cl.createStatement();
	            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

	            if (rsLogin.next()) {

	                risultato = rsLogin.getString("id_cartellaclinica");
	            }

	            cl.close();
	        } catch (SQLException e) {
	            e.getStackTrace();
	        }
	        return risultato;
	    }
		
		
		
	public String queryIdTartaruga(String idtartaruga) {
		
		String risultato = new String();

        try {
            String queryLogin = "SELECT c.id_tartaruga FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
                                                                                                        
            Statement statementQueryLogin = cl.createStatement();
            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

            if (rsLogin.next()) {

                risultato = rsLogin.getString("id_tartaruga");
            }

            cl.close();
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return risultato;
    }
	
	
	
	
		public String queryLunghezza(String idtartaruga) {
			
			String risultato = new String();

	        try {
	            String queryLogin = "SELECT c.lunghezza FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
	                                                                                                        
	            Statement statementQueryLogin = cl.createStatement();
	            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

	            if (rsLogin.next()) {

	                risultato = rsLogin.getString("lunghezza");
	            }

	            cl.close();
	        } catch (SQLException e) {
	            e.getStackTrace();
	        }
	        return risultato;
	    }
		
		
		
		public String queryLarghezza(String idtartaruga) {
			
			String risultato = new String();

	        try {
	            String queryLogin = "SELECT c.larghezza FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
	                                                                                                        
	            Statement statementQueryLogin = cl.createStatement();
	            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

	            if (rsLogin.next()) {

	                risultato = rsLogin.getString("larghezza");
	            }

	            cl.close();
	        } catch (SQLException e) {
	            e.getStackTrace();
	        }
	        return risultato;
	    }
		
		
		
		
				public String queryPeso(String idtartaruga) {
					
					String risultato = new String();

			        try {
			            String queryLogin = "SELECT c.peso FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
			                                                                                                        
			            Statement statementQueryLogin = cl.createStatement();
			            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

			            if (rsLogin.next()) {

			                risultato = rsLogin.getString("peso");
			            }

			            cl.close();
			        } catch (SQLException e) {
			            e.getStackTrace();
			        }
			        return risultato;
			    }
				
				
				
				public String queryDescrizione(String idtartaruga) {
					
					String risultato = new String();

			        try {
			            String queryLogin = "SELECT c.descrizione FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
			                                                                                                        
			            Statement statementQueryLogin = cl.createStatement();
			            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

			            if (rsLogin.next()) {

			                risultato = rsLogin.getString("descrizione");
			            }

			            cl.close();
			        } catch (SQLException e) {
			            e.getStackTrace();
			        }
			        return risultato;
			    }
				
				
				
				
				public String queryDataIngresso(String idtartaruga) {
					
					String risultato = new String();

			        try {
			            String queryLogin = "SELECT c.data_ingresso FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
			                                                                                                        
			            Statement statementQueryLogin = cl.createStatement();
			            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

			            if (rsLogin.next()) {

			                risultato = rsLogin.getString("data_ingresso");
			            }

			            cl.close();
			        } catch (SQLException e) {
			            e.getStackTrace();
			        }
			        return risultato;
			    }
				
				
				
				public String querySelezioneLuogo(String idtartaruga) {
					
					String risultato = new String();

			        try {
			            String queryLogin = "SELECT c.luogo_ritrovamento FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
			                                                                                                        
			            Statement statementQueryLogin = cl.createStatement();
			            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

			            if (rsLogin.next()) {

			                risultato = rsLogin.getString("luogo_ritrovamento");
			            }

			            cl.close();
			        } catch (SQLException e) {
			            e.getStackTrace();
			        }
			        return risultato;
			    }
				
				
				
				
				public String querySelezioneTarghetta(String idtartaruga) {
					
					String risultato = new String();

			        try {
			            String queryLogin = "SELECT c.targhetta FROM cartella_clinica as c WHERE c.id_tartaruga = '" + idtartaruga + "'";
			                                                                                                        
			            Statement statementQueryLogin = cl.createStatement();
			            ResultSet rsLogin = cl.st.executeQuery(queryLogin); 

			            if (rsLogin.next()) {

			                risultato = rsLogin.getString("targhetta");
			            }

			            cl.close();
			        } catch (SQLException e) {
			            e.getStackTrace();
			        }
			        return risultato;
			    }
				
				
	public void queryInserimentoDB(tartaruga t ) {
		try {
			cl.st.executeUpdate("INSERT INTO cartella_clinica (id_cartellaclinica, id_tartaruga, nome_tartaruga, info_specie, lunghezza, larghezza, peso, luogo_ritrovamento, descrizione, data_ingresso,targhetta)"
            		+ "SELECT '" + t.id_cartella + "','" + t.idtartaruga + "', nome_tartaruga, info_specie,'" + t.lunghezza + "','" +  t.larghezza + "','" + t.peso + "','" + t.luogo_ritrovamento + "','" + t.descrizione + "','" + t.data_ingresso + "',targhetta\r\n"                             
            		+ "	FROM cartella_clinica\r\n"
            		+ "	WHERE targhetta = '" + t.idtartaruga + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
   }


