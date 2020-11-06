package org.javacream.change_value_to_reference;

public class Order {
	private Customer customer;

	public Order(String customerName) {
		this.customer = new Customer(customerName);
	}

	public String getCustomer() {
		return customer.getName();
	}

	public void setCustomer(String customerName) {
		customer = new Customer(customerName);
	}

}
