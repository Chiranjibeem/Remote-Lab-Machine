package com.order.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRAN_ITEM")
public class TranItem {

	@EmbeddedId
	private TranItemPk item;

	@Column(name = "ITEM_ID")
	private String itemID;

	@Column(name = "ITEM_SOLD_PRICE")
	private BigDecimal itemSoldPrice;

	/*@ManyToOne
	private TranHeader header;

	public TranHeader getHeader() {
		return header;
	}

	public void setHeader(TranHeader header) {
		this.header = header;
	}*/

	public TranItemPk getItem() {
		return item;
	}

	public void setItem(TranItemPk item) {
		this.item = item;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public BigDecimal getItemSoldPrice() {
		return itemSoldPrice;
	}

	public void setItemSoldPrice(BigDecimal itemSoldPrice) {
		this.itemSoldPrice = itemSoldPrice;
	}

}
