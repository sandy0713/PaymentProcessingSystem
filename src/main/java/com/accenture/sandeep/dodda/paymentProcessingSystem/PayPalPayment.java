package com.accenture.sandeep.dodda.paymentProcessingSystem;

public class PayPalPayment extends Payments{
	 	public PayPalPayment() {
			super("PayPal");
		}
		
		public void paymentType()
		{
			System.out.println("PayPal payment");
		}
}
