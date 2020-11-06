package org.javacream.replace_method_with_method_object;

public class Sample {

	public boolean checkCondition(String value, String subString,
			boolean ignoreCase) {
		String tempValue;
		String tempSubString;
		if (ignoreCase) {
			tempValue = value.toUpperCase();
			tempSubString = subString.toUpperCase();
		} else {
			tempValue = value;
			tempSubString = subString;
		}
		int position = tempValue.indexOf(tempSubString);
		logPosition(position);
		return position > 0;

	}

	public void logPosition(int position) {
		System.out.println(position);
	}
}
