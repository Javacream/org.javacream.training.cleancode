package org.javacream.movemethod;

public class Account {
	private AccountType accountType;
	private int daysOverdrawn;

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0)
			result += accountType.overdraftCharge(this);
		return result;
	}

	public double getDaysOverdrawn() {
		return daysOverdrawn;
	}

}
