package com.order.payment.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public String doPayment(String paymentMode, String totalAmount) {
		return totalAmount + " Got Debited From Your Account Number Ending With *******87";
	}

}
