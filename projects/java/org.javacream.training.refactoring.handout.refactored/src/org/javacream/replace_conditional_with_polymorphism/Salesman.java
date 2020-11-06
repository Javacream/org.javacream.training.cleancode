package org.javacream.replace_conditional_with_polymorphism;

public class Salesman extends Employee {

	@Override
	int getType() {
		return Employee.SALESMAN;
	}

	@Override
	int payAmount() {
		return monthlySalary + commission;
	}

}
