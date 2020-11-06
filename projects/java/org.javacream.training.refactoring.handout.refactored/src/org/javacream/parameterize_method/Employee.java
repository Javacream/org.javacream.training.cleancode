package org.javacream.parameterize_method;

public class Employee {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void tenPercentRaise() {
		raise(.1);
	}

	void fivePercentRaise() {
		raise(.05);
	}

	void raise(double factor) {
		salary *= (1 + factor);
	}
}
