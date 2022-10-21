package DemoProject.DemoProject;
import java.sql.*;
public class jdbcdemo1 {
	static String url="jdbc:mysql://localhost:3306/ani";
	static String username="root";
	static String password="root";
	static String query1="select * from Employee";
	
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			String query2="delete from Employee where emp_id=22";
			Statement st=con.createStatement();
			st.executeUpdate(query2);
			ResultSet rs=st.executeQuery(query1);
			//rs.next();
			while(rs.next()) {
				System.out.println("Employee Name:"+rs.getString("emp_name"));
				System.out.println("Employee Id:"+rs.getInt("emp_id"));
				System.out.println("Employee Address:"+rs.getString("address"));
				System.out.println("Employee salary:"+rs.getInt("salary"));
				System.out.println("----------------------------------------------");
			}
			con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
