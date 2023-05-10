package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class A {
	public static void main(String[] args) {
		try {
			//Connect To Database
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			System.out.println(con);
			
			//Write SQL Queries
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('Omkar sawant','kavathepiran','omkarsawant@321gamil.com','9943217648')");
			
			//Close Connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
