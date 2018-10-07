package com.order.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAN_HEADER")
public class TranHeader {

	@Id
	@Column(name = "ORDER_NO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNO;

	@Column(name = "B_DATE")
	private Date businessDate;

	@Column(name = "START_TIME")
	private Date startTime;

	@Column(name = "END_TIME")
	private Date endTime;

	@Column(name = "CUST_ID")
	private String custID;

	@Column(name = "TOTAL_PRICE")
	private BigDecimal totalPrice;
	
	/*@OneToMany
	@JoinColumn(name="ORDER_NO",referencedColumnName="ORDER_NO")
	private List<TranItem> tranItem;*/
	
	/*public List<TranItem> getTranItem() {
		return tranItem;
	}

	public void setTranItem(List<TranItem> tranItem) {
		this.tranItem = tranItem;
	}*/

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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

}
