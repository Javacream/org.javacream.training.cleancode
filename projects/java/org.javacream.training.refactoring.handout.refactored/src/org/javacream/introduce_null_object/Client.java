package org.javacream.introduce_null_object;

public class Client {

	public BillingPlan doBilling(Customer customer) {
		if (customer.isNull()) {
			System.out.println("creating billingPlan for null customer");
		}
		return customer.getBillingPlan();
	}
}
