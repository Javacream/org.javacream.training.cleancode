package org.javacream.extractclass;

public class Person {
	
	private String name;
	private TelephoneNumber telephoneNumber;
	public TelephoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getName() {
		return name;
	}
}