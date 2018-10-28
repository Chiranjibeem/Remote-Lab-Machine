package com.core.java.serialize;

public class TestClient2 {

	public static void main(String[] args) {

		SerializeAndDeserialize<Employee> s = new SerializeAndDeserialize<Employee>(new Employee("Chiranjibee",
				"Mohapatra", 27, "COMPLEX", new Address("Line1", "Line2", "Line3"), "RISPL071", "Retail"));
		s.serialize();

		Employee p = s.deserialize(System.getProperty("user.dir") + "/" + "person.ser");
		System.out.println(p.getpFirstName() + "\n" + p.getpLastName() + "\n" + p.getAge() + "\n" + p.getAttitude()
				+ "\n" + p.getSerialversionuid() + "\n" + p.getEmployeeID() + "\n" + p.getCompnayName());
		;
		try {
			System.out.println(p.getAddress().getAddressLine1() + "-" + p.getAddress().getAddressLine2() + "-"
					+ p.getAddress().getAddressLine3());
		} catch (NullPointerException e) {
			System.out.println("Address : Null");
		}

	}

}
