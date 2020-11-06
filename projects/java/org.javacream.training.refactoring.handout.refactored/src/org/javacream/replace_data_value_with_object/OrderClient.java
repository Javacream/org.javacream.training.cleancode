package org.javacream.replace_data_value_with_object;

import java.util.Collection;

public class OrderClient {

	public int numberOfOrdersFor(Collection<Order> orders, String customer) {
		return Order.numberOfOrdersFor(orders, customer);
	}

}
