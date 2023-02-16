package query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import GUImedico.collegamento;

public class statisticheDAO {
	collegamento cl = new collegamento();
				
				public String queryNumeroTartarugheTotali(){
				    try {
				        String sql = "SELECT COUNT(cartella_clinica.data_ingresso) as count_ingresso\r\n"
				                + " FROM cartella_clinica JOIN statistiche ON cartella_clinica.data_ingresso BETWEEN statistiche.data_inizio AND statistiche.data_fine\r\n"
				                + "WHERE cartella_clinica.data_ingresso BETWEEN statistiche.data_inizio AND statistiche.data_fine";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}
				
				
				
				public String queryNumeroTartarugheMorte(){
				    try {
				        String sql = "SELECT COUNT(DISTINCT vita_tartarughe.data_morte) as count_morte\r\n"
				                + " FROM vita_tartarughe JOIN statistiche ON vita_tartarughe.data_morte BETWEEN statistiche.data_inizio AND statistiche.data_fine\r\n"
				                + "WHERE vita_tartarughe.data_morte BETWEEN statistiche.data_inizio AND statistiche.data_fine";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}
				
				
				
				
				public String queryNumeroTartarugheLiberate(){
				    try {
				        String sql = "SELECT COUNT(DISTINCT vita_tartarughe.data_liberazione) as count_liberazione\r\n"
				                + " FROM vita_tartarughe JOIN statistiche ON vita_tartarughe.data_liberazione BETWEEN statistiche.data_inizio AND statistiche.data_fine\r\n"
				                + "WHERE vita_tartarughe.data_liberazione BETWEEN statistiche.data_inizio AND statistiche.data_fine";
				        ResultSet rs = cl.st.executeQuery(sql);
				        if (rs.next()) {
				            int count = rs.getInt(1);
				            return String.valueOf(count);
				        }
				        System.out.println("accesso effettuato");
				        cl.close();
				    } catch (SQLException e) {
				        e.getStackTrace();
				    }
				    return null;
				}
				
				
				
				
				public DefaultTableModel statisticheAnnuali() {
					DefaultTableModel modello = new DefaultTableModel();
					modello.addColumn("id_tartaruga");
					modello.addColumn("nome");
					modello.addColumn("Data Ingresso");
					modello.addColumn("Anno");
					try {
						String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, c.data_ingresso, EXTRACT ( YEAR FROM c.data_ingresso) from cartella_clinica as c order by c.data_ingresso";

						cl.st.getConnection().createStatement(); 
						ResultSet rsLogin = cl.st.executeQuery(queryLogin); 
						
						while (rsLogin.next()) {

							modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
						}

						cl.close();
					} catch (SQLException e) {
						e.getStackTrace();
					}
					return modello;
				}




				public DefaultTableModel statisticheMensili() {
					DefaultTableModel modello = new DefaultTableModel();
					modello.addColumn("id tartaruga");
					modello.addColumn("nome");
					modello.addColumn("Data Ingresso");
					modello.addColumn("Mese");
					try {
						String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, c.data_ingresso, EXTRACT ( MONTH FROM c.data_ingresso) from cartella_clinica as c order by c.data_ingresso";

						Statement statementQueryLogin = cl.st.getConnection().createStatement(); 
						ResultSet rsLogin = statementQueryLogin.executeQuery(queryLogin);
						
						while (rsLogin.next()) {

							modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
						}

						cl.close();
					} catch (SQLException e) {
						e.getStackTrace();
					}
					return modello;
			}
				
				
				
				public DefaultTableModel statisticheAnnualiLiberate() {
					DefaultTableModel modello = new DefaultTableModel();
					modello.addColumn("id_tartaruga");
					modello.addColumn("nome");
					modello.addColumn("Data liberazione");
					modello.addColumn("Anno");
					try {
						String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, v.data_liberazione, EXTRACT ( YEAR FROM v.data_liberazione) from cartella_clinica as c join vita_tartarughe as v on c.id_tartaruga = v.id_tartaruga order by v.data_liberazione";

						cl.st.getConnection().createStatement();
						ResultSet rsLogin = cl.st.executeQuery(queryLogin);
						
						while (rsLogin.next()) {

							modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
						}

						cl.close();
					} catch (SQLException e) {
						e.getStackTrace();
					}
					return modello;
				}
				
				
				
				
					public DefaultTableModel statisticheMensiliLiberate() {
						DefaultTableModel modello = new DefaultTableModel();
						modello.addColumn("id_tartaruga");
						modello.addColumn("nome");
						modello.addColumn("Data liberazione");
						modello.addColumn("Mese");
						try {
							String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, v.data_liberazione, EXTRACT ( MONTH FROM v.data_liberazione) from cartella_clinica as c join vita_tartarughe as v on c.id_tartaruga = v.id_tartaruga order by v.data_liberazione";

							cl.st.getConnection().createStatement();
							ResultSet rsLogin = cl.st.executeQuery(queryLogin);
							
							while (rsLogin.next()) {

								modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
							}

							cl.close();
						} catch (SQLException e) {
							e.getStackTrace();
						}
						return modello;
					}
					
					
					
					public DefaultTableModel statisticheAnnualiMorte() {
						DefaultTableModel modello = new DefaultTableModel();
						modello.addColumn("id_tartaruga");
						modello.addColumn("nome");
						modello.addColumn("Data morte");
						modello.addColumn("Anno");
						try {
							String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, v.data_morte, EXTRACT ( YEAR FROM v.data_morte) from cartella_clinica as c join vita_tartarughe as v on c.id_tartaruga = v.id_tartaruga order by v.data_morte";

							cl.st.getConnection().createStatement();
							ResultSet rsLogin = cl.st.executeQuery(queryLogin);
							
							while (rsLogin.next()) {

								modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
							}

							cl.close();
						} catch (SQLException e) {
							e.getStackTrace();
						}
						return modello;
					}
					
					
					
					
						public DefaultTableModel statisticheMensiliMorte() {
							DefaultTableModel modello = new DefaultTableModel();
							modello.addColumn("id_tartaruga");
							modello.addColumn("nome");
							modello.addColumn("Data morte");
							modello.addColumn("Anno");
							try {
								String queryLogin = "select c.id_tartaruga, c.nome_tartaruga, v.data_morte, EXTRACT ( MONTH FROM v.data_morte) from cartella_clinica as c join vita_tartarughe as v on c.id_tartaruga = v.id_tartaruga order by v.data_morte";

								cl.st.getConnection().createStatement();
								ResultSet rsLogin = cl.st.executeQuery(queryLogin);
								
								while (rsLogin.next()) {

									modello.addRow(new Object[] {rsLogin.getString(1), rsLogin.getString(2), rsLogin.getString(3), rsLogin.getString(4)}); 								
								}

								cl.close();
							} catch (SQLException e) {
								e.getStackTrace();
							}
							return modello;
						}

}
