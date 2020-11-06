package org.javacream.change_unidirectional_association_to_bidirectional;


public class Order {

	private String orderId;
	private Customer customer;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
		customer.addOrder(this);
	}
}
