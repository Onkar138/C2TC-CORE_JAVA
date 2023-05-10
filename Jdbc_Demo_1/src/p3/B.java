//Update the sql quries:

package p3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter name:");
			String name = s.next();
			System.out.println("Enter city:");
			String city = s.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myregapp","root","test");
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE registration SET  name= '"+name+"' WHERE city= '"+city+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
