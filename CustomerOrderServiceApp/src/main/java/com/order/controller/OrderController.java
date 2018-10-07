package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.service.OrderService;

@RestController
@EnableAutoConfiguration
public class OrderController {

	@Autowired
	OrderService service;

	@PostMapping(value = "/createOrder")
	@ResponseBody
	public String createOrder(@RequestBody Order order) {
		if (order != null && order.getCustomer() != null && order.getItem() != null) {
			int orderNo = service.createOrder(order);
			return orderNo != 0 ? "Order Created : Order ID : " + orderNo : "Order Not Created ";

		} else {
			return "Order Not Created,Check Order Details, It Seems You Did not Set The Property Properly";
		}

	}
}
