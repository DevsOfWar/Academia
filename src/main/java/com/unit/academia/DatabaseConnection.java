package com.unit.academia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DatabaseConnection {
	public static Connection conn;
	public static Statement stmt;
	static {
		try {
			DatabaseConnection.conn = conn();
			stmt = DatabaseConnection.conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection conn() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlserver://bdunitcaiofel.database.windows.net;database=academia;user=appconn;password=app@1234;");
	}
	
	
}
