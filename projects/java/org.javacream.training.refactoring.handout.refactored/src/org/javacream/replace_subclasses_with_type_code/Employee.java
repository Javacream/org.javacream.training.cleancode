package org.javacream.replace_subclasses_with_type_code;

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

	public static Employee createEngineer(){
		return new Employee(ENGINEER);
	}
	public static Employee createSalesman(){
		return new Employee(SALESMAN);
	}
	public static Employee createManager(){
		return new Employee(MANAGER);
	}
}
