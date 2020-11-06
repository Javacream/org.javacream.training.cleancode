package org.javacream.replace_error_code_with_exception;

public class Account {
	private int balance;

	void withdraw(int amount) throws BalanceException {
		if (amount > balance)
			throw new BalanceException();
		balance -= amount;
	}

}
