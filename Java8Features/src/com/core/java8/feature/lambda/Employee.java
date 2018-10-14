package com.core.java8.feature.lambda;

public class Employee {

	private String empID;

	private String firstName;

	private String lastName;

	private int salary;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee(String empID, String firstName, String lastName,int salary) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
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
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	

}