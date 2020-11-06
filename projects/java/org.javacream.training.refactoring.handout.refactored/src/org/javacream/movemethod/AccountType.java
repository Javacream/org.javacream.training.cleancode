package org.javacream.movemethod;

public class AccountType {
	private boolean premium;

	public boolean isPremium() {
		return premium;
	}

	double overdraftCharge(Account account) {
		if (premium) {
			double result = 10;
			if (account.getDaysOverdrawn() > 7)
				result += (account.getDaysOverdrawn() - 7) * 0.85;
			return result;
		} else
			return account.getDaysOverdrawn() * 1.75;
	}

}
