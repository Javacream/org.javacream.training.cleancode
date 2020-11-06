package org.javacream.change_value_to_reference;

import java.util.HashMap;

public class Customer {

	private final String name;

	private static HashMap<String, Customer> customers;

	static {
		customers = new HashMap<String, Customer>();
	}

	private Customer(String name) {
		super();
		this.name = name;
	}

	public static Customer create(String name) {
		Customer customer = customers.get(name);
		if (customer == null) {
			customer = new Customer(name);
			customers.put(name, customer);
		}
		return customer;
	}

	public String getName() {
		return name;
	}
}
