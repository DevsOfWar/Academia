package com.unit.academia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DatabaseConnection {
	
	public static Connection conn() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlserver://bdunitcaiofel.database.windows.net;database=academia;user=appconn;password=app@1234;");
	}
}
