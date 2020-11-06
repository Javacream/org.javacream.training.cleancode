package org.javacream.replace_nested_conditional_with_guard_clauses;

public class Sample {

	private boolean isDead;
	private boolean isSeparated;
	private boolean isRetired;

	double getPayAmount() {
		if (isDead)
			return deadAmount();
		if (isSeparated)
			return separatedAmount();
		if (isRetired)
			return retiredAmount();
		return normalPayAmount();
	};

	private double deadAmount() {
		return 0;
	}

	private double separatedAmount() {
		return 1;
	}

	private double retiredAmount() {
		return 2;
	}

	private double normalPayAmount() {
		return 3;
	}

}
