package org.javacream.change_bidirectional_association_to_unidirectional;

import java.util.Set;

public class Client {

	public double calculateTotalPrice(Customer customer){
		Set<Order> orders = customer.getOrders();
		double price = 0;
		for (Order order: orders){
			price += order.calculatePrice(customer);
		}
		return price;
	}
}
