package org.javacream.consolidate_conditional_expression;

public class Sample {

	private int seniority;
	private int monthsDisabled;
	private boolean isPartTime;
	private int age;

	public double disabilityAmount() {
		if (isNotEligibleForDisability())
			return 0;
		if (isPartiallyEligibleForDisability())
			return 1;
		return 5;
	}

	private boolean isNotEligibleForDisability() {
		return ((seniority < 2) || (monthsDisabled > 12) || (isPartTime));
	}

	private boolean isPartiallyEligibleForDisability() {
		return age > 50;
	}

}
