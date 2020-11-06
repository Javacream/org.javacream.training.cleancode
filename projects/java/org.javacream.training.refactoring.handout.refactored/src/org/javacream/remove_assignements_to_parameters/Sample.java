package org.javacream.remove_assignements_to_parameters;

public class Sample {

	public double applyDiscount(final double price) {
		double discountPrice;
		if (price > 1000){
			discountPrice = price*.90;
		}else{
			discountPrice = price;
		}
		return discountPrice;
	}
}
