package com.core.java.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5162281125287448287L;

	private String pFirstName;

	private String pLastName;

	private int age;

	// Case : 1//If we want to send reference object through the network then we
	// must and should
	// implements serilizable interface like how we implement serilizable interface
	// in Address class
	// private Address address;

	// case2//if we dont have access to address class we can not implement
	// serilizable interface
	// so we can make address class as transient

	private transient Address address;

	// case3//we have declare address as transient but still need to save address
	// object
	private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException {
		try {
			os.defaultWriteObject();
			os.writeObject(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
		try {
			is.defaultReadObject();
			Address address = (Address) is.readObject();
			System.out.println(
					address.getAddressLine1() + "-" + address.getAddressLine2() + "-" + address.getAddressLine3());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static String getAttitude() {
		return attitude;
	}

	public static void setAttitude(String attitude) {
		Person.attitude = attitude;
	}

	private static String attitude;

	public Person(String pFirstName, String pLastName, int age, String attitude, Address address) {
		super();
		this.pFirstName = pFirstName;
		this.pLastName = pLastName;
		this.age = age;
		this.attitude = attitude;
		this.address = address;
	}

	public String getpFirstName() {
		return pFirstName;
	}

	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}

	public String getpLastName() {
		return pLastName;
	}

	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

}
