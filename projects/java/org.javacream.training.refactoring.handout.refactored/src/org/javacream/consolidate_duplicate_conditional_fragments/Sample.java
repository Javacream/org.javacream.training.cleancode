package org.javacream.consolidate_duplicate_conditional_fragments;

public class Sample {

	public void sendBill(double price){
		if (isSpecialDeal()) {
			double total = price * 0.95;
		    send(total);
		}
		else {
			double total = price * 0.98;
		    send(total);
		}

	}

	private void send(double total) {
		//send bill
	}

	private boolean isSpecialDeal() {
		//check conditions
		return true;
	}
}
