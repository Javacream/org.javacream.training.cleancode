package org.javacream.replace_type_code_with_class;

public class Person {

	private BloodGroup bloodGroup;

	public Person(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setBloodGroup(BloodGroup arg) {

		bloodGroup = arg;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
}
