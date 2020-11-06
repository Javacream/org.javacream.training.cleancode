package org.javacream.replace_method_with_method_object;

public class CheckCondition {

	private Sample sample;
	private String value;
	private String subString;
	private String tempValue;
	private String tempSubString;
	private boolean ignoreCase;
	private int position;
	public CheckCondition(Sample sample, String value, String subString, boolean ignoreCase) {
		super();
		this.sample = sample;
		this.value = value;
		this.subString = subString;
		this.ignoreCase = ignoreCase;
	}
	public boolean checkCondition() {
		if (ignoreCase) {
			tempValue = value.toUpperCase();
			tempSubString = subString.toUpperCase();
		} else {
			tempValue = value;
			tempSubString = subString;
		}
		position = tempValue.indexOf(tempSubString);
		sample.logPosition(position);
		return position > 0;

	}
	
}
