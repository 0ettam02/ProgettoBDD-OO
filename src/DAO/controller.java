package DAO;



import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import progetto_bd_oo.cartella_clinica;

public class controller {
	collegamento cl = new collegamento();
	
	Integer cont = 0;

	public void contatore(String data) {
		if(data != null){
			cont = cont + 1;
			cont++;
		}
		System.out.println(cont);
	}

	
}
