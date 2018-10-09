package com.order.service;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public String createOrder(String orderID, String totalAmount) {
		return " Order ID : "+orderID+" Created For Worth Of "+totalAmount;
		}

}
