package org.javacream.introduce_foreign_method;

import java.util.Date;

public class Sample {

	public void doSample(){
		Date actualDate = new Date();
		System.out.println("Tomorrow: " + nextDay(actualDate));
	}
	
	@SuppressWarnings("deprecation")
	public static Date nextDay(Date date){
		return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);
		
	}
}
