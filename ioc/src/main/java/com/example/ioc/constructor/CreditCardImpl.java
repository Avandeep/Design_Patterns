package com.example.ioc.constructor;

import org.springframework.stereotype.Component;

@Component// create the instance of classes
public class CreditCardImpl implements CreditCard {

	@Override// will use to inject objects
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment Made");
	}

}
