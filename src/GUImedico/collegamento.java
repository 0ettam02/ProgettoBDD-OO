package GUImedico;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class collegamento {
    public ResultSet rs;
    public java.sql.Statement st = null;
    public collegamento () {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/clone";
            Connection con = DriverManager.getConnection(url, "postgres", "matteo"); 
            System.out.println("Connessione OK \n");
            st = con.createStatement();

            }catch (ClassNotFoundException e) {
                System.out.println("DB driver non trovato \n");
                System.out.println(e);
            }
            catch(SQLException e) {
                System.out.println("Connessione Fallita \n");
                System.out.println(e);


                 
            }
        }
	public void close() {
		
	}
	public Statement createStatement() {
		return null;
	}
	
	
	
        
}
