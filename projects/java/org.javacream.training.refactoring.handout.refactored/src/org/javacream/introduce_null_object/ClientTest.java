package org.javacream.introduce_null_object;


import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

	@Test public void testClientWithCustomer(){
		Customer customer = new Customer("Hugo");
		Assert.assertFalse(customer.isNull());
		BillingPlan billingPlan = customer.getBillingPlan();
		Assert.assertNotNull(billingPlan);
	}
	@Test public void testClientWithNullCustomer(){
		Customer customer = new NullCustomer();
		Assert.assertTrue(customer.isNull());
		BillingPlan billingPlan = customer.getBillingPlan();
		Assert.assertNotNull(billingPlan);
	}
}
