package org.javacream.replace_method_with_method_object;

public class Sample {
	
	public boolean checkCondition(String value, String subString,
			boolean ignoreCase) {
		return new CheckCondition(this, value, subString, ignoreCase).checkCondition();
	}
	public void logPosition(int position) {
		System.out.println(position);
	}

}
