package org.javacream.form_method_template;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPersonTable extends SelectTableTemplate{

	@Override
	public String getJdbcUrl() {
		return "jdbc:acme:localhost";
	}

	@Override
	public String getSqlStatement() {
		return "select * from Person";
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
