package com.jdp.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	private CreditCard creditCard;

	@Autowired
	public CustomerImpl(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	@Override
	public void pay() {
		creditCard.makePayment();
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
