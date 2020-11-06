package org.javacream.replace_exception_with_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {

	private Stack<Connection> available;
	private Stack<Connection> allocated;

	private String url;

	Connection getResource() {
		Connection result;
	    if (available.isEmpty()) {
	         try {
				result = DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
	         allocated.push(result);
	         return result;
	    }
	    else {
	         result = available.pop();
	      allocated.push(result);
	      return result;
	  }
	}

}
