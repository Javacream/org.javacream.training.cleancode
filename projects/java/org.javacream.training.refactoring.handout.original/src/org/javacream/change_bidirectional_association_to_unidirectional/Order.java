package org.javacream.change_bidirectional_association_to_unidirectional;


public class Order {

	private String orderId;
	private double price;
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
	
	public double calculatePrice(){
		if ("premium".equals(customer.getState())){
			return price*.9;
		}else{
			return price;
		}
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
