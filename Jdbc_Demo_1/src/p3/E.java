package p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class E {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testingapp","root","test");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("delete from employee where EID=104");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
