package org.javacream.replace_conditional_with_polymorphism;

public abstract class Employee {

	int monthlySalary;
	int commission;
	int bonus;

	Employee() {
	}

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	abstract int getType();
	public static Employee create(int type) {
	    switch (type) {
	        case ENGINEER:
	           return new Engineer();
	        case SALESMAN:
	           return new Salesman();
	        case MANAGER:
	           return new Manager();
	        default:
	           throw new IllegalArgumentException("Incorrect type code value");
	    }
	}
	abstract int payAmount();
}
