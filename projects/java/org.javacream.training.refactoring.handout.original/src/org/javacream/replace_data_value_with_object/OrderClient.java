package org.javacream.replace_data_value_with_object;

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
