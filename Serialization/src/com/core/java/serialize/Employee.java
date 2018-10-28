package com.core.java.serialize;

import java.io.Serializable;

public class Employee extends Person implements Serializable{

	private String employeeID;

	private String compnayName;

	public String getEmployeeID() {
		return employeeID;
	}

	public Employee(String pFirstName, String pLastName, int age, String attitude, Address address, String employeeID,
			String compnayName) {
		super(pFirstName, pLastName, age, attitude, address);
		this.employeeID = employeeID;
		this.compnayName = compnayName;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getCompnayName() {
		return compnayName;
	}

	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}

}
