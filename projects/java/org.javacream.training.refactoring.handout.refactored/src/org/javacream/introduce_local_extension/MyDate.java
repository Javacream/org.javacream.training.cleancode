package org.javacream.introduce_local_extension;

import java.util.Date;

public class MyDate extends Date {
	private static final long serialVersionUID = 1L;

	public MyDate() {
		super();
	}

	public MyDate(long time) {
		super(time);
	}

	public MyDate(Date date) {
		super(date.getTime());
	}

	@SuppressWarnings("deprecation")
	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDay() + 1);
	}

}
