package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class E {
	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myregapp","root","test");
			System.out.println(con);
			System.out.println();
			
			Statement stmnt=con.createStatement();
			ResultSet result=stmnt.executeQuery("select * from registration");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
				System.out.println();
			}
			
		con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
