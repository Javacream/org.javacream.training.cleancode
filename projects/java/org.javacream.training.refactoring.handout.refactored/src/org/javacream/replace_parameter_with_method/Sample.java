package org.javacream.replace_parameter_with_method;

public class Sample {

	private int quantity;
	private int itemPrice;

	public double getPrice() {
		return discountedPrice();
	}

	private double discountedPrice() {
		if (getDiscountLevel() == 2)
			return getBasePrice() * 0.1;
		else
			return getBasePrice() * 0.05;
	}

	private double getBasePrice() {
		return quantity * itemPrice;
	}

	private int getDiscountLevel() {
		if (quantity > 100)
			return 2;
		else
			return 1;
	}

}
