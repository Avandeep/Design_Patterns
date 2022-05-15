package com.example.ioc.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {
	
	//CreditCard creditcard=new CreditCardImpl();//create initiate manually

	//@Autowired// to inject object through spring container
	private CreditCard creditcard;
	
	//if you don't want to field level injection
	
	@Autowired
	CustomerImpl(CreditCard creditcard)
	{
		this.creditcard=creditcard;
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		getCreditcard().makePayment();
	}
	
	public CreditCard getCreditcard() {
		return creditcard;
	}

	
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}

}
