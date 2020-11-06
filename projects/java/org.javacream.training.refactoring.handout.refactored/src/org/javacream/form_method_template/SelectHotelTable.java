package org.javacream.form_method_template;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectHotelTable extends SelectTableTemplate {

	@Override
	public String getJdbcUrl() {
		return "jdbc:nh:localhost";
	}

	@Override
	public String getSqlStatement() {
		return "select * from Hotel";
	}

	@Override
	public void handleResultSet(ResultSet rs) {
		// ...

	}

	@Override
	public void handleSqlException(SQLException e) {
		e.printStackTrace();
	}
}
