package org.javacream.replace_type_code_with_subclasses;

public class Employee {
	private int type;

	Employee(int type) {
		this.type = type;
	}

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public int getType() {
		return type;
	}

}
