package org.javacream.inlinemethod;

public class Sample {

	public void printAmountsGreatherThanNull(double[] amounts){
		for(double amount: amounts){
			if (isAmountGreatherThanNull(amount)){
				System.out.println(amount);
			}
		}
	}

	private boolean isAmountGreatherThanNull(double amount) {
		return amount > 0;
	}
}
