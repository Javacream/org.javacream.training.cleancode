package org.javacream.extract_interface;

public class CompanyAddressableDecorator extends Company implements Addressable {

	@Override
	public String toString() {
		return "CompanyAddressableDecorator [toString()=" + super.toString()
				+ "]";
	}

}
