package com.core.java8.feature.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static Integer totalSalry(List<Employee> l) {

		Function<List<Employee>, Integer> totalSalry = (e) -> {

			int salary = 0;
			for (int i = 0; i < e.size(); i++) {
				salary = salary + e.get(i).getSalary();
			}
			return salary;
		};

		return totalSalry.apply(l);

	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("F67676", "Chintu", "Mohapatra",1000));
		empList.add(new Employee("F6934", "Shekhar", "Reddy",1000));
		empList.add(new Employee("F70876", "Lokesh", "Dulha",1000));
		
		System.out.println(totalSalry(empList));
	}

}
