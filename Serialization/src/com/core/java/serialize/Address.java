package com.core.java.serialize;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3083607405800525338L;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public Address(String addressLine1, String addressLine2, String addressLine3) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
	}

}
