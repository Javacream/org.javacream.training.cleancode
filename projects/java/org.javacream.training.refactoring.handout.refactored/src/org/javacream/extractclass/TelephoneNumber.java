package org.javacream.extractclass;

public class TelephoneNumber {

	private String officeAreaCode;
	private String officeNumber;

	public String getOfficeAreaCode() {
		return officeAreaCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeAreaCode(String arg) {
		officeAreaCode = arg;
	}

	public void setOfficeNumber(String arg) {
		officeNumber = arg;
	}

	public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ") " + officeNumber);
	}

}
