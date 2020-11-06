package org.javacream.replace_subclasses_with_type_code;

public class Engineer extends Employee {

	public static final int ENGINEER_TYPE = 0;
	@Override
	public int getType() {
		return ENGINEER_TYPE;
	}

}
