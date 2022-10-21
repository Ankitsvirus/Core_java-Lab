package DemoProject.DemoProject;
import java.sql.*;
public class jdbcdemo2 {
	static String url="jdbc:mysql://localhost:3306/ani";
	static String username="root";
	static String password="root";
	static String query="select * from Employee";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String name=rs.getString("emp_name");
			System.out.println(name);
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
	}

}
