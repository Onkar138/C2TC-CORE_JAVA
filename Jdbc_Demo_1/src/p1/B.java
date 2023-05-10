package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			
			//Connect To JDBC
			
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydata","root","test");
			System.out.println(con);
	
			//write SQL queries
			
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into datatable values('Ganesh','30','ganesh@gmail.com','123456785');");
	
			// close connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
