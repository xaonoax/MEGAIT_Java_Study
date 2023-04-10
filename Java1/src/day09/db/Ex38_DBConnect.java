package day09.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex38_DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");  // 대소문자 틀리면 못 찾음
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3399/member",
					"root",
					"1234");
		}
		catch(Exception e) {
			System.out.println("Exception Occurred");
		}
		
		if(conn != null) {
			System.out.println("Congratulations!!!!!");
			System.out.println("Database Connection OK");
			System.out.println(conn);
		}
		

	}

}
