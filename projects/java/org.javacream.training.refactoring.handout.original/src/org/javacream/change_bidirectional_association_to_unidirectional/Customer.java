package org.javacream.change_bidirectional_association_to_unidirectional;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Customer {

	private String name;
	private String state;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set<Order> getOrders() {
		return Collections.unmodifiableSet(orders);
	}
	
}
