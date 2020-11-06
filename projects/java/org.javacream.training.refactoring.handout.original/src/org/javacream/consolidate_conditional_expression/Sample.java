package org.javacream.consolidate_conditional_expression;

public class Sample {

	private int seniority;
	private int monthsDisabled;
	private boolean isPartTime;
	private int age;

	public double disabilityAmount() {
		if (seniority < 2)
			return 0;
		if (age > 50)
			return 1;
		if (monthsDisabled > 12)
			return 0;
		if (isPartTime)
			return 0;

		return 5;
	}

}
