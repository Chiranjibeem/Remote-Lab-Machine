package com.core.java8.feature.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

	public static void modifyAndPrintEmployee(Employee t) {
		System.out.println("Before Consumer");
		System.out.println(t);

		Predicate<Employee> p = (p1) -> p1.getFirstName().startsWith("C");
		Consumer<Employee> e1 = (e) -> {

			if (p.test(t)) {
				e.setSalary(e.getSalary() + 90000);
			}
			System.out.println("After Consumer");
			System.out.println(e);
		};

		e1.accept(t);

	}

	public static void main(String[] args) {
		modifyAndPrintEmployee(new Employee("f7890", "Chintu", "Moha", 9090));

	}

}
