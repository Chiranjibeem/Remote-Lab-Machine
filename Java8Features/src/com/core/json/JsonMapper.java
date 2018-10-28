package com.core.json;

import java.io.File;
import java.io.IOException;

import com.core.java8.feature.lambda.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(new File(System.getProperty("user.dir") + "/" + "Employee.json"),
					new Employee("2357794", "Chiranjibee", "Mohapatra", 900000));
			System.out.println("Employee Object Converted to JSON Format");

			Employee e = mapper.readValue(new File(System.getProperty("user.dir") + "/" + "Employee.json"),
					Employee.class);

			System.out.println(e.getEmpID() + "\n" + e.getFirstName() + "\n" + e.getLastName() + "\n" + e.getSalary());
			System.out.println("JSON File Converted to Employee Object");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
