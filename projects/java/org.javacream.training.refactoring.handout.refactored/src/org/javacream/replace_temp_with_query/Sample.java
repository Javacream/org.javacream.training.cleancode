package org.javacream.replace_temp_with_query;

public class Sample {

	public double calculateTotalPrice(int quantity, double pricePerItem) {
		if (calculatePrice(quantity, pricePerItem) > 1000) {
			return calculatePrice(quantity, pricePerItem) * .95;
		} else {
			return calculatePrice(quantity, pricePerItem) * .95;
		}
	}

	public double calculatePrice(int quantity, double pricePerItem) {
		return quantity * pricePerItem;
	}
}
