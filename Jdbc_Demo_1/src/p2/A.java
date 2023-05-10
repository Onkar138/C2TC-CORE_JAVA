package p2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Your Name: ");
			String name=s.next();
			System.out.println("Enter Your city: ");
			String city=s.next();
			System.out.println("Enter Your email: ");
			String email=s.next();
			System.out.println("Enter Your mobile: ");
			String mobile=s.next();
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myregapp","root","test");
			System.out.println(con);
			
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("INSERT into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
			con.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
