package org.javacream.replace_type_code_with_class;

public class Person {

	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;
	private int bloodGroup;

	public Person(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setBloodGroup(int arg) {
		if (checkArg(arg)) {
			bloodGroup = arg;
		}
	}

	private boolean checkArg(int arg) {
		return arg == O || arg == A || arg == B || arg == AB;
	}

	public int getBloodGroup() {
		return bloodGroup;
	}
}
