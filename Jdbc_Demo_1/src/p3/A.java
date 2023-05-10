//Delete the sql quries:

package p3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		try {
			System.out.println("Enter name:");
			Scanner s=new Scanner(System.in);
			String name = s.next();
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myregapp","root","test");
			System.out.println(con);
			
				Statement stmnt = con.createStatement();
				stmnt.executeUpdate("DELETE FROM registration WHERE name='"+name+"';");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
