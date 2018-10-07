package com.order.entity;

import java.util.List;


public class Order {
	
	private Customer customer;
	
	private List<Item> item;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	

}
