package org.javacream.change_value_to_reference;

public class Order {
	private Customer customer;

	public Order(String customerName) {
		this.customer = Customer.create(customerName);
	}

	public String getCustomer() {
		return customer.getName();
	}

	public void setCustomer(String customerName) {
		customer = Customer.create(customerName);
	}

}
