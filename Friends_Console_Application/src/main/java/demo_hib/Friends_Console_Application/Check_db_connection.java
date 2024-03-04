package demo_hib.Friends_Console_Application;

import java.sql.Connection;
import java.sql.DriverManager;

public class Check_db_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/db_friend?useSSL=false";
		String user = "root";
		String pass = "12345678";
		try {
			System.out.println("Connecting to database" + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
