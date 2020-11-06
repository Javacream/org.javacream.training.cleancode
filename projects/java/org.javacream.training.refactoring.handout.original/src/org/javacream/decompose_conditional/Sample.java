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
		if (date.before(SUMMER_START) || date.after(SUMMER_END))
			charge = quantity * winterRate + winterServiceCharge;
		else
			charge = quantity * summerRate;

		return charge;
	}
}
