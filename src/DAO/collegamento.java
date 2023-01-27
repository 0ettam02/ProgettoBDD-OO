package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class collegamento {
    public ResultSet rs;
    public Statement st;
    public collegamento () {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/progetto_ob_bdd";
            Connection con = DriverManager.getConnection(url, "postgres", "matteo"); 
            System.out.println("Connessione OK \n");
        // use the connection to perform SQL operation
            //conn.close();
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
		// TODO Auto-generated method stub
		
	}
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
        
}
