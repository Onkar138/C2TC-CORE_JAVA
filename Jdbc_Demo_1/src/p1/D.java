package p1;
//Delete The Query:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class D {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			System.out.println(con);
			
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("DELETE FROM registration WHERE name='onkar'");
			
			con.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
