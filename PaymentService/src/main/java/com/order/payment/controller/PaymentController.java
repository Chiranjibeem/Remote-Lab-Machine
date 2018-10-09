package com.order.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.payment.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@PostMapping(value = "/createPayment")
	public String createPayment(@RequestParam(value="mode") String paymentMode, @RequestParam(value="amt")String totalAmount) {
		if (paymentMode != null && !paymentMode.equals("") && totalAmount != null) {
			return paymentService.doPayment(paymentMode, totalAmount);
		}
		return "Payment Failed.Check Payment Mode and Total Amount";

	}

}
