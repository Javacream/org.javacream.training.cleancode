package org.javacream.change_unidirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private String name;
	private Set<Order> orders;
	
	{
		orders = new HashSet<Order>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void addOrder(Order order){
		orders.add(order);
		order.setCustomer(this);
	}
	
}
