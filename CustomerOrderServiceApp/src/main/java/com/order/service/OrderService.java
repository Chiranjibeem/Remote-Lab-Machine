package com.order.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.dao.OrderDAOImpl;
import com.order.entity.Item;
import com.order.entity.Order;
import com.order.entity.TranHeader;
import com.order.entity.TranItem;
import com.order.entity.TranItemPk;

@Service
public class OrderService {

	@Autowired
	OrderDAOImpl dao;
	
	@Autowired
	RestTemplate template;

	public int createOrder(Order order) {
		if (order != null) {

			BigDecimal totalPrice = new BigDecimal("0");
			List<TranItem> tranItemList = new ArrayList<TranItem>();
			Iterator<Item> itemItr = order.getItem().iterator();
			int index = 1;
			while (itemItr.hasNext()) {
				Item item = itemItr.next();

				totalPrice = totalPrice.add(item.getItemPrice());

				TranItemPk tranItemPK = new TranItemPk();
				tranItemPK.setBusinessDate(new Date());
				tranItemPK.setItemSeq(index);

				TranItem tranItem = new TranItem();
				tranItem.setItem(tranItemPK);
				tranItem.setItemID(item.getItemID());
				tranItem.setItemSoldPrice(item.getItemPrice());

				tranItemList.add(tranItem);
				index++;

			}
			TranHeader header = new TranHeader();
			header.setCustID(order.getCustomer().getCustomerID());
			header.setBusinessDate(new Date());
			header.setStartTime(new Date());
			header.setEndTime(new Date());
			// header.setOrderNO("9090");
			header.setTotalPrice(totalPrice);
			// header.setTranItem(tranItemList);

			return dao.createOrder(header, tranItemList);
		}
		return 0;
	}

}
