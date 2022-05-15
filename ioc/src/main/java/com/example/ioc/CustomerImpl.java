package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {
	
	//CreditCard creditcard=new CreditCardImpl();//create initiate manually

	@Autowired// to inject object through spring container
	CreditCard creditcard;
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		creditcard.makePayment();
	}

}
