package org.javacream.introduce_null_object;

public class Client {

	public BillingPlan doBilling(Customer customer) {
		if (customer == null) {
			System.out.println("creating billingPlan for null customer");
			return new BillingPlan("default");
		} else {
			return customer.getBillingPlan();
		}
	}
}
