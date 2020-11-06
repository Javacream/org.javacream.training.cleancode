package org.javacream.replace_type_code_with_state;

public class Employee {
	private EmployeeState type;

	Employee(EmployeeState type) {
		this.type = type;
	}

	public EmployeeState getType() {
		return type;
	}
	

}
