package org.javacream.replace_type_code_with_subclasses;

public class Manager extends Employee {

	@Override
	int getType() {
		return Employee.MANAGER;
	}

}
