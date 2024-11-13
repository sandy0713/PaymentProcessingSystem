package com.accenture.sandeep.dodda.paymentProcessingSystem;

public class CreditCardPayment extends Payments{
	
	 public CreditCardPayment() {
		super("Credit Card");
	}
	
	public void paymentType()
	{
		System.out.println("Credit card payment");
	}
	
}
