package com.core.java8.feature.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingUsingLambda {

	private class Employee {

		private String empID;

		private String firstName;

		private String lastName;

		public Employee(String empID, String firstName, String lastName) {
			super();
			this.empID = empID;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getEmpID() {
			return empID;
		}

		public void setEmpID(String empID) {
			this.empID = empID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(90);
		al.add(10);
		al.add(20);
		al.add(70);
		al.add(60);
		al.add(30);
		al.add(40);

		System.out.println("ArrayList Sorting");
		System.out.println("Before Sorting");
		System.out.println(al);
		Collections.sort(al, (a1, a2) -> -a1.compareTo(a2));
		System.out.println("After Sorting");
		System.out.println(al);
		System.out.println("*********************************");

		TreeSet<Integer> t = new TreeSet<>((a1, a2) -> -a1.compareTo(a2));
		t.add(90);
		t.add(10);
		t.add(20);
		t.add(70);
		t.add(60);
		t.add(30);
		t.add(40);

		System.out.println("Tree Set Sorting in Descending Order");
		System.out.println(t);
		System.out.println("*********************************");

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>((a1, a2) -> -a1.compareTo(a2));
		tm.put(90, "90");
		tm.put(10, "10");
		tm.put(20, "20");
		tm.put(70, "70");
		tm.put(60, "60");
		tm.put(30, "30");
		tm.put(40, "40");

		System.out.println("Tree Map Sorting Order in Descending Order");
		System.out.println(tm);
		System.out.println("*********************************");

		ArrayList<Employee> empList = new ArrayList<>();
		SortingUsingLambda sorting = new SortingUsingLambda();
		empList.add(sorting.new Employee("F67676", "Chintu", "Mohapatra"));
		empList.add(sorting.new Employee("F6934", "Shekhar", "Reddy"));
		empList.add(sorting.new Employee("F70876", "Lokesh", "Dulha"));

		System.out.println("Before Sorting");
		System.out.println(empList);
		Collections.sort(empList, (a1, a2) -> -a1.getEmpID().compareTo(a2.getEmpID()));
		System.out.println("After Sorting");
		System.out.println(empList);

	}

}
