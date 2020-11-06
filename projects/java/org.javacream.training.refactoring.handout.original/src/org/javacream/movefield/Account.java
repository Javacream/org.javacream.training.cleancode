package org.javacream.movefield;

public class Account {
	@SuppressWarnings("unused")
	private AccountType accountType;
	private int interestRate;
	
	public double interestForAmount_days (double amount, int days) {
	    return interestRate * amount * days / 365;
	}


}
