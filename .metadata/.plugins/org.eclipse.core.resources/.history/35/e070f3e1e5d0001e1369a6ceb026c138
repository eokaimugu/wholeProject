package JDBCMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
1) Create a connection.
2) Create a statement/Query
3)Execute statement/Query
4) Close connection*/


public class JDBCMySql {

	public static void main(String[] args) throws SQLException {
		
		//1) Creating a connection
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "2Cor5+vrs17");
		
		//2) Create a statement/Query
		
		Statement stmt = con.createStatement();
		
		String s = "Insert into student values (103, 'Smith')";
		//String s = "Update student set sname='Eric' Where sid=103";
		//String s = "Delete from student where sid=103";
		
		//3)Execute statement
		stmt.execute(s);
		
		//4) Close connection
		con.close();
		System.out.println("Query executed....");
	}

}
