package JavaConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//String host="localhost";

		//String port= "3306";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeportal","root","tree");

		Statement s=con.createStatement();

		ResultSet rs=s.executeQuery("select * from employeeinfo");

 while(rs.next())
 {
	 System.out.println("Name "+rs.getString(1));
	 System.out.println("Location "+rs.getString(3));
 }
	}

}
