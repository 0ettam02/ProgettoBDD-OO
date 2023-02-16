package query;
import java.sql.ResultSet;
import java.sql.SQLException;

import GUImedico.collegamento;

public class loginPageDAO {
	collegamento cl = new collegamento();
	
		public boolean queryAccessoDip(String matricola) {
			boolean check = false;
			try {
				String sql = "SELECT matricoladp FROM dipendente WHERE matricoladp = '" + matricola + "'";
				ResultSet rs = cl.st.executeQuery(sql);

				if (!rs.next()) {
					return false;
				}
				check = true;

				System.out.println("accesso effettuato");

				cl.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
			return check;

		}

}
