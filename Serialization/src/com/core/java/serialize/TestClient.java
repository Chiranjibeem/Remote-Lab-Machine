package com.core.java.serialize;

public class TestClient {

	public static void main(String[] args) {

		SerializeAndDeserialize<Person> s = new SerializeAndDeserialize<Person>(
				new Person("Chiranjibee", "Mohapatra", 27, "COMPLEX", new Address("Line1", "Line2", "Line3")));
		s.serialize();

		Person p = s.deserialize(System.getProperty("user.dir") + "/" + "person.ser");
		System.out.println(p.getpFirstName() + "\n" + p.getpLastName() + "\n" + p.getAge() + "\n" + p.getAttitude()
				+ "\n" + p.getSerialversionuid());
		;
		try {
			System.out.println(p.getAddress().getAddressLine1() + "-" + p.getAddress().getAddressLine2() + "-"
					+ p.getAddress().getAddressLine3());
		} catch (NullPointerException e) {
			System.out.println("Address : Null");
		}

	}

}
