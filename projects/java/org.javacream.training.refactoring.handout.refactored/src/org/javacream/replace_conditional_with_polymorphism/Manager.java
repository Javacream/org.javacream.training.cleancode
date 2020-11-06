package org.javacream.replace_conditional_with_polymorphism;

public class Manager extends Employee {

	@Override
	int getType() {
		return Employee.MANAGER;
	}
	int payAmount(){
        return monthlySalary + bonus;
	}

}
