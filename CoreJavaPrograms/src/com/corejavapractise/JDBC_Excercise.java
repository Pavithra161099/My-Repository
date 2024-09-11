package com.corejavapractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Excercise {

	public static void main(String[] args) throws Exception {
	
		//1. Register the driver class.
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Establish connection
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		
//		//3. create the Statement object
//		Statement stmt = con.createStatement();
//		
//		//4. Execute the query
//		ResultSet rs= stmt.executeQuery("Select * from emp");
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getInt(2));
//		}
		
//		5.close the connection
//		con.close();

	}

}
