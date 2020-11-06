package org.javacream.remove_assignements_to_parameters;

public class Sample {

	public double applyDiscount(double price) {
		if (price > 1000){
			price = price*.90;
		}
		return price;
	}
}
