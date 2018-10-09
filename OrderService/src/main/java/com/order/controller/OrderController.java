package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/createOrder")
	public String createOrder(@RequestParam(value = "order") String OrderID,
			@RequestParam(value = "amt") String totalAmount, @RequestParam(value = "mode") String paymentMode) {
		if (OrderID != null && !OrderID.equals("") && totalAmount != null) {

			String paymentResponse = restTemplate.postForObject(
					"http://EUREKA-CLIENT1/createPayment?mode=" + paymentMode + "&amt=" + totalAmount,
					new HttpEntity<>(new String()), String.class);
			return paymentResponse + " : " + orderService.createOrder(OrderID, totalAmount);
		}
		return "Payment Failed.Check Payment Mode and Total Amount";

	}

}
