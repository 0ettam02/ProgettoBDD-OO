package controllerDAO;

import java.awt.TextArea;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import DAO.collegamento;

public class riammissioneDAO {
	collegamento cl = new collegamento();
	private String id_cartellaclinica;
	private String id_tartaruga;
	private String lunghezza;
	private String larghezza;
	private String peso;
	private String descrizione;
	private String data_ingresso;
	
	//QUERY INSERIMENTO ID TARTARUGA
//	public void queryInsertId(String id_tartaruga) {
//		try {
//			cl.st.executeUpdate("INSERT INTO tartaruga VALUES ('" + id_tartaruga + "')");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	//QUERY SELEZIONE ID TARTARUGA E INSERIMENTO NELLA TABELLA
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
	
	
	
	//QUERY ID CARTELLA CLINICA
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
		
		
		
	//QUERY ID TARTARUGA
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
	
	//QUERY LUNGHEZZA
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
		
		//QUERY LARGHEZZA
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
		
		//QUERY PESO
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
				
				
				//QUERY DESCRIZIONE
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
				
				
				//QUERY DESCRIZIONE
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
				
				//QUERY LUOGO RITROVAMENTO
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
				
				
				//QUERY TARGHETTA
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

//QUERY INSERIMENTO RIAMMISSIONE NEL DB
	public void queryInserimentoDB(String idtartaruga, String id_cartella, String lunghezza, String larghezza, String peso, String luogo_ritrovamento, String descrizione, String data_ingresso ) {
		try {
			cl.st.executeUpdate("INSERT INTO cartella_clinica (id_cartellaclinica, id_tartaruga, nome_tartaruga, info_specie, lunghezza, larghezza, peso, luogo_ritrovamento, descrizione, data_ingresso,targhetta)"
            		+ "SELECT '" + id_cartella + "',id_tartaruga, nome_tartaruga, info_specie,'" + lunghezza + "','" +  larghezza + "','" + peso + "','" + luogo_ritrovamento + "','" + descrizione + "','" + data_ingresso + "',targhetta\r\n"                             
            		+ "	FROM cartella_clinica\r\n"
            		+ "	WHERE targhetta = '" + idtartaruga + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
   }


