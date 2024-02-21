package com.test.accountpay.service;

import com.test.payment.PayableDocument;
import com.test.payment.PaymentMethod;

public class AccountPayService {

	private PaymentMethod paymentMethod;

	
	public AccountPayService(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay(PayableDocument doc) {
		paymentMethod.pay(doc);

	}	
}
