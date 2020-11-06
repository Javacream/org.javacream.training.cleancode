package org.javacream.replace_data_value_with_object;

import java.util.Collection;

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

	
	public static int numberOfOrdersFor(Collection<Order> orders, String customer) {
		int result = 0;
		for (Order order : orders) {
			if (order.getCustomer().equals(customer))
				result++;
		}
		return result;
	}

}
