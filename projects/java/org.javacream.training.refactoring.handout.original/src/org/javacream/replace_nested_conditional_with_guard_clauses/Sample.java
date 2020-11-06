package org.javacream.replace_nested_conditional_with_guard_clauses;

public class Sample {

	private boolean isDead;
	private boolean isSeparated;
	private boolean isRetired;

	double getPayAmount() {
		   double result;
		   if (isDead) result = deadAmount();
		   else {
		       if (isSeparated) result = separatedAmount();
		       else {
		           if (isRetired) result = retiredAmount();
		           else result = normalPayAmount();
		       };
		   }
		return result;
		}

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
