package org.javacream.form_method_template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPersonTable {

	public void executeStatement() {
		String sql = "select * from Person";
		String url = "jdbc:acme:localhost";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url);
			ResultSet rs = connection.createStatement().executeQuery(sql);
			while (rs.next()) {
				// do something...
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
