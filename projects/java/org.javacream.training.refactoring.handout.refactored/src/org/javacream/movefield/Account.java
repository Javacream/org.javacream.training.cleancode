package org.javacream.movefield;

public class Account {
	private AccountType accountType;
	public double interestForAmount_days (double amount, int days) {
	    return accountType.getInterestRate() * amount * days / 365;
	}


}
