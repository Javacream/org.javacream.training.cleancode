package org.javacream.replace_conditional_with_polymorphism;

public class Engineer extends Employee {

	@Override
	int getType() {
		return Employee.ENGINEER;
	}

}
