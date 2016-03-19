package mobile.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String db_url = "jdbc:mysql://localhost:3306/jiguli.bg?user=root?autoReconnect=true&useSSL=false";
	private static final String user = "root";
	private static final String pass = "";

	private static DBConnection instance = null;
	private Connection connection;

	private DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(db_url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DBConnection getInstance() {
		synchronized (DBConnection.class) {
			if (instance == null) {
				instance = new DBConnection();
			}
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}
}
