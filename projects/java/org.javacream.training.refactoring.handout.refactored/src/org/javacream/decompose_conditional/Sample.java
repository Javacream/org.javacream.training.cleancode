package org.javacream.decompose_conditional;

import java.util.Date;

public class Sample {

	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;
	private double winterRate;
	private double winterServiceCharge;
	private double summerRate;

	public double calculateCharge(Date date, int quantity) {
		double charge;
		if (notSummer(date))
			charge = winterCharge(quantity);
		else
			charge = summerCharge(quantity);
		return charge;
	}

	private boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}

	private double summerCharge(int quantity) {
		return quantity * summerRate;
	}

	private double winterCharge(int quantity) {
		return quantity * winterRate + winterServiceCharge;
	}
}
