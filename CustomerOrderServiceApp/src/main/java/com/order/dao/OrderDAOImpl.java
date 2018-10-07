
package com.order.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.order.entity.TranHeader;
import com.order.entity.TranItem;
import com.order.repository.OrderHeaderRepository;
import com.order.repository.OrderLineRepository;

@Repository
@Transactional
public class OrderDAOImpl {

	@Autowired
	OrderHeaderRepository headerRepository;

	@Autowired
	OrderLineRepository lineRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public int createOrder(TranHeader header, List<TranItem> itemList) {
		TranHeader tranHeader = headerRepository.save(header);
		itemList.forEach(f -> f.getItem().setOrderNO(tranHeader.getOrderNO()));
		lineRepository.saveAll(itemList);
		return tranHeader != null ? tranHeader.getOrderNO() : 0;
	}
}
