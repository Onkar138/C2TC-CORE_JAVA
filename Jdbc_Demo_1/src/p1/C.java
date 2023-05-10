//Update The Query:

package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/myregapp","root","test");
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE registration SET mobile = '9522905100' WHERE name='Omkar sawant'");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
