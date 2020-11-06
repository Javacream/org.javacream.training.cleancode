package org.javacream.replace_exception_with_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.Stack;

public class ConnectionPool {
	private Stack<Connection> available;
	private Stack<Connection> allocated;
	private String url;

	Connection getResource() {
		Connection result;
		try {
			result = available.pop();
			allocated.push(result);
			return result;
		} catch (EmptyStackException e) {
			try {
				result = DriverManager.getConnection(url);
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
			allocated.push(result);
			return result;
		}
	}

}
