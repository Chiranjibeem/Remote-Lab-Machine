
package com.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TranItemPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ORDER_NO")
			//, insertable = false, updatable = false)
	private int orderNO;

	@Column(name = "B_DATE")
			//, insertable = false, updatable = false)
	private Date businessDate;

	@Column(name = "ITEM_SEQ")
			//, insertable = false, updatable = false)
	private int itemSeq;

	public int getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(int orderNO) {
		this.orderNO = orderNO;
	}

	public Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public int getItemSeq() {
		return itemSeq;
	}

	public void setItemSeq(int itemSeq) {
		this.itemSeq = itemSeq;
	}

}