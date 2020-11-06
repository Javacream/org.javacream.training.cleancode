package org.javacream.replace_subclasses_with_type_code;

public class Manager extends Employee {

	public static final int MANAGER_TYPE = 2;
	@Override
	public int getType() {
		return MANAGER_TYPE;
	}

}
