package JDBCMySql;
/*
1) create a connection
2) Create a statement?query
3) Execute the statement/query
4) Store the data in a resultset
5) close connection*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlSelectCommand {

	public static void main(String[] args) throws SQLException {
		
		//1) Creating a connection
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "2Cor5+vrs17");
				
				//2) Create a statement/Query				
				Statement stmt = con.createStatement();
				String s = "select employee_id, first_name, last_name from employee";
				
				//3)Execute statement & store data in resultset
				ResultSet rs = stmt.executeQuery(s);
		while(rs.next())
		{
			int eid = rs.getInt("Employee_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			
			System.out.println(eid+" "+fname+" "+lname);
		}
		

	}

}
