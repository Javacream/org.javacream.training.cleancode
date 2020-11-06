package org.javacream.consolidate_duplicate_conditional_fragments;

public class Sample {

	public void sendBill(double price) {
		double total;
		if (isSpecialDeal()) {
			total = price * 0.95;
		} else {
			total = price * 0.98;
		}
		send(total);

	}

	private void send(double total) {
		// send bill
	}

	private boolean isSpecialDeal() {
		// check conditions
		return true;
	}
}
