package org.javacream.introduce_null_object;

public class NullCustomer extends Customer {

	{
		super.setBillingPlan(new BillingPlan("default"));
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void setBillingPlan(BillingPlan billingPlan) {
	}

}
