package DemoProject.DemoProject;
import java.sql.*;

public class SqlExample1 {
	static String url="jdbc:mysql://localhost:3306/ACCOUNT";
	static String username="root";
	static String password="Shivani@123";
	static String query="drop database acount";
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("database is dropped successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
