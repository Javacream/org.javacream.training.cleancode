package org.javacream.introduce_foreign_method;

import java.util.Date;

public class Sample {

	@SuppressWarnings("deprecation")
	public void doSample(){
		Date actualDate = new Date();
		Date tomorrow = new Date(actualDate.getYear(), actualDate.getMonth(), actualDate.getDay() + 1);
		System.out.println("Tomorrow: " + tomorrow);
	}
}
