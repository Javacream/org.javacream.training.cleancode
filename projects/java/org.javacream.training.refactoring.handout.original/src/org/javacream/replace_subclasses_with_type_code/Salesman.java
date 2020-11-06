package org.javacream.replace_subclasses_with_type_code;

public class Salesman extends Employee {
	public static final int SALESMAN_TYPE = 1;
	@Override
	public int getType() {
		return SALESMAN_TYPE;
	}

}
