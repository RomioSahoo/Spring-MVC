package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DaoService {

	public static Connection getConnection() {
		ResourceBundle rb = ResourceBundle.getBundle("connection");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		Connection con = null;
		try {
			// loading driver
			Class.forName(driver);
			// connecting driver
			con = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return con;
	}

}
