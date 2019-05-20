package com.qr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {        
//	public Connection getConnection(){
//		Connection connection=null;
//		System.out.println("Connection called");
//		try {
//			//Class.forName("com.mysql.cj.jdbc.Driver");
//		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_qr","root", "kea123#M");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} /*catch (Exception e) {
//			e.printStackTrace();
//		}*/
//		return connection;
//	}


	// declare a connection
	public Connection getConnection(){
		 Connection connection = null;
		// declare a JDBC driver
		 String DRIVER = "com.mysql.cj.jdbc.Driver";
		// declare a Database
		 String db = "test_qr";
		// declare a URL
		 String url = "jdbc:mysql://localhost:3306/" + db;
		// declare a UserName
		 String user = "root";
		// declare a password
		 String password = "kea123#M";

//		// a method to connect to db - Can pass user and password through parameters
//		public static Connection connect (/*String user, String password*/) {
//			System.out.println("\n--Connecting to the MySQL JDBC");

        /*try {
            Class.forName(DRIVER);
            System.out.println("\n--MySQL JDBC driver is registered--");
        } catch (ClassNotFoundException ex) {
            System.out.println("\n--MySQL JDBC driver is not registered--");
            ex.printStackTrace();
        }

        System.out.println("\n--Connection to MySQL DBMS has been established--");
*/
			try {
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("\n--Connection successful--");
			} catch (SQLException ex) {
				System.out.println("\n--Connection failed--");
				ex.printStackTrace();
			}
			return connection;
	}

	}
