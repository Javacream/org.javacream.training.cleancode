package org.javacream.inlinemethod;

public class Sample {

	public void printAmountsGreatherThanNull(double[] amounts){
		for(double amount: amounts){
			if (amount > 0){
				System.out.println(amount);
			}
		}
	}
}
