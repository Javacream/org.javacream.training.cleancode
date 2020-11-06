package org.javacream.change_bidirectional_association_to_unidirectional;


public class Order {

	private String orderId;
	private double price;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double calculatePrice(Customer customer){
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
