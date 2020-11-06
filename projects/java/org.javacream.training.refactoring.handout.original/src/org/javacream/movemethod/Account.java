package org.javacream.movemethod;

public class Account {
	private AccountType accountType;
	private int daysOverdrawn;

	double overdraftCharge() {
		if (accountType.isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7)
				result += (daysOverdrawn - 7) * 0.85;
			return result;
		} else
			return daysOverdrawn * 1.75;
	}

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0)
			result += overdraftCharge();
		return result;
	}

}
