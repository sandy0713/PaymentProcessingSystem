package com.accenture.sandeep.dodda.paymentProcessingSystem;

public abstract class Payments implements MyCard {
	//abstract public void creditCardPayment();
	//abstract public void payPalPayment();
	
	public String typeOfPayment;
	
	Payments(String typeOfPayment){
		this.typeOfPayment = typeOfPayment;
	}
}
