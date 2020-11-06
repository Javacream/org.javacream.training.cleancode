package org.javacream.replace_type_code_with_subclasses;

public class Salesman extends Employee {

	@Override
	int getType() {
		return Employee.SALESMAN;
	}

}
