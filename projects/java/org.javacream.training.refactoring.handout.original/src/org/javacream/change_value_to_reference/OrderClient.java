package org.javacream.change_value_to_reference;

import java.util.Collection;

public class OrderClient {

	public int numberOfOrdersFor(Collection<Order> orders, String customer) {
		int result = 0;
		for (Order order : orders) {
			if (order.getCustomer().equals(customer))
				result++;
		}
		return result;
	}

}
