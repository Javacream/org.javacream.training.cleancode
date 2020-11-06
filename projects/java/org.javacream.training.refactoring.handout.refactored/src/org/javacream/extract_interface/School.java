package org.javacream.extract_interface;

public class School {

	private String name;
	private String city;
	private String street;

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String address) {
		this.city = address;
	}

	@Override
	public String toString() {
		return "School [city=" + city + ", name=" + name + ", street=" + street
				+ "]";
	}
}
