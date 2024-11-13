package com.accenture.sandeep.dodda.paymentProcessingSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Payments payment1 = new CreditCardPayment();
        payment1.paymentType();
        
        Payments payment2 = new PayPalPayment();
        payment2.paymentType();
    }
}
