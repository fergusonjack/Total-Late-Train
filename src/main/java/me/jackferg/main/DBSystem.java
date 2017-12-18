package me.jackferg.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

//this is a system to work with postgresql also own file format which is then used by Main
public class DBSystem {

	protected static String username = "postgresql";
	protected static String password = getpassword();
	protected static String database = "jack";
	protected static String URL = "jdbc:postgresql://localhost/" + database;
	protected static String[] databasenames = { "trainName", "timeAndInfo" };

	public static void main(String[] args) {
	}

	// creates the tables needed
	public void addTables(Connection conn) {

		PreparedStatement trainName = null;
		PreparedStatement timeAndInfo = null;

		String trainNameSQL = "CREATE TABLE trainNames ( id INT PRIMARY KEY NOT NULL, trainid VARCHAR(255) NOT NULL);";

	}

	public static Connection connectToDB(String url, String username, String pass) {

		System.out.println("Example showing connection to mod-intro-databases server");

		try {

			// Load the PostgreSQL JDBC driver
			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver not found");
			System.exit(1);
		}

		System.out.println("PostgreSQL driver registered.");

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, pass);
		} catch (SQLException ex) {
			System.out.println("Ooops, couldn't get a connection");
			System.out.println("Check that <username> & <password> are right");
			System.exit(1);
		}

		if (conn != null) {
			System.out.println("Database accessed!");
		} else {
			System.out.println("Failed to make connection");
			System.exit(1);
		}

		return conn;
	}

	public void droptables(Connection conn) {
		PreparedStatement studentQuery = null;
		try {
			for (String name : databasenames) {
				studentQuery = conn.prepareStatement("DROP TABLE IF EXISTS " + name);
				studentQuery.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in the dropping of the tables");
			e.printStackTrace();
		}
	}

	public void close(Connection conn) {
		// Now, just tidy up by closing connection
		try {
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error in the closing of the connection");
			ex.printStackTrace();
		}
	}

	public static String getpassword() {
		String text = "";
		try {
			BufferedReader brTest = new BufferedReader(new FileReader("password.pass"));
			text = brTest.readLine();
			text = brTest.readLine();
			brTest.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if (text == "") {
			System.out.println("error with getting to token");
			System.exit(0);
		}
		System.out.println(text);
		return text;
	}

}
