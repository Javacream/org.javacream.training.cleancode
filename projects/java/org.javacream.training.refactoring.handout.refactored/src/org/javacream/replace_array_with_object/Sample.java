package org.javacream.replace_array_with_object;

public class Sample {

	public void doSample() {
		Address address = new Address();
		address.setCity("München");
		address.setStreet("Alois-Gilg-Weg");
		printAddress(address);
	}

	private void printAddress(Address address) {
		System.out.println("City: " + address.getCity() + ", street: "
				+ address.getStreet());
	}

	class Address {
		String city, street;

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

	}

}
