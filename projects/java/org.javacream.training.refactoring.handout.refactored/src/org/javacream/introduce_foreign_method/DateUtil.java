package org.javacream.introduce_foreign_method;

import java.util.Date;

public abstract class DateUtil {
	@SuppressWarnings("deprecation")
	public static Date nextDay(Date date) {
		return new Date(date.getYear(), date.getMonth(), date.getDay() + 1);

	}
}
