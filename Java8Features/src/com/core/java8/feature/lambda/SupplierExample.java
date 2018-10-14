package com.core.java8.feature.lambda;

import java.util.function.Supplier;

public class SupplierExample {

	public static Integer getRandomNumber() {
		Supplier<Integer> s = () -> {
			return (int) (Math.random() * 30 + 1);
		};

		return s.get();

	}

	public static void main(String[] args) {
		System.out.println(getRandomNumber());
	}

}
