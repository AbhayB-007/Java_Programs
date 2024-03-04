package demo_hib.Hibernate_using_sqlserver;

import java.lang.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:sqlserver://MY-BEAST:1434;database=db_Hib";		
		String user = "root";
		String pass = "12345678";
		try {
			System.out.println("Connecting to database ->" + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl);
			System.out.println("Connection Successful!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
