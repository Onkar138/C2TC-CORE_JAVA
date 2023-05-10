//Insert the sql quries:

package p3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Name");
			String name = s.next();
			System.out.println("Enter city");
			String city = s.next();
			System.out.println("Enter email");
			String email = s.next();
			System.out.println("Enter mobile");
			String mobile = s.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myregapp","root","test");
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("INSERT INTO registration (name,city,email,mobile) VALUES ('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
