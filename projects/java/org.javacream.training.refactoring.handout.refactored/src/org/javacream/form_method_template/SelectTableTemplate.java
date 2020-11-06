package org.javacream.form_method_template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SelectTableTemplate {

	public void executeStatement() {
		String sql = getSqlStatement();
		String url = getJdbcUrl();
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url);
			ResultSet rs = connection.createStatement().executeQuery(sql);
			while (rs.next()) {
				handleResultSet(rs);
			}
		} catch (SQLException e) {
			handleSqlException(e);

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

	public abstract void handleSqlException(SQLException e);

	public abstract void handleResultSet(ResultSet rs);

	public abstract String getJdbcUrl();

	public abstract String getSqlStatement();
}
