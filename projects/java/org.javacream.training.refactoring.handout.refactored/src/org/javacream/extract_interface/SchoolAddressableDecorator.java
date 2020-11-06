package org.javacream.extract_interface;

import java.util.StringTokenizer;

public class SchoolAddressableDecorator extends School implements Addressable {

	@Override
	public String getAddress() {
		return getStreet() + "," + getCity() ;
	}

	@Override
	public void setAddress(String address) {
		StringTokenizer stringTokenizer = new StringTokenizer(address, ",");
		setStreet(stringTokenizer.nextToken());
		setCity(stringTokenizer.nextToken());
	}

	@Override
	public String toString() {
		return "SchoolAddressableDecorator [getAddress()=" + getAddress()
				+ ", getCity()=" + getCity() + ", getName()=" + getName()
				+ ", getStreet()=" + getStreet() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
