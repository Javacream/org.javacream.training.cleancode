package org.javacream.replace_error_code_with_exception;

public class Account {
	private int balance;

	int withdraw(int amount) {
		if (amount > balance)
			return -1;
		else {
			balance -= amount;
			return 0;
		}
	}

}
