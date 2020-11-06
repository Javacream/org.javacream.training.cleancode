package org.javacream.replace_temp_with_query;

public class Sample {

	public double calculatePrice(int quantity, double pricePerItem){
		double price = quantity * pricePerItem;
		if (price > 1000){
			return price * .95;
		}else{
			return price * .98;
		}
	}
}
