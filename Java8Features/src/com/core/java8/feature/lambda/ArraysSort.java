package com.core.java8.feature.lambda;

import java.util.Arrays;
import java.util.Currency;

public class ArraysSort {

	volatile Integer[] elements = { 23, 67, 8, 9, 23, 45, 67, 90, 12 };

	static long x = (long) 999d;

	public static <T> void getElements(T elements[]) {
		for (int i = 0; i < elements.length; i++) {

			System.out.print(elements[i] + " ");
		}

		System.out.println();
	}

	public static boolean isNumber(String s) {

		try {
			Integer i = Integer.parseInt(s);
			return i != null ? true : false;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(isNumber("g9999999"));
		System.out.println(System.getProperty("os.arch"));

		Currency currency = Currency.getInstance("USD");
		System.out.println(currency.getSymbol());

		System.out.println(x);

		Integer[] elements = { 23, 67, 8, 9, 23, 45, 67, 90, 12 };

		getElements(elements);

		Arrays.sort(elements);

		getElements(elements);

		String[] elements1 = { "23", "67", "8", "9", "23", "45", "67", "90", "12" };

		getElements(elements1);

		Arrays.sort(elements1);

		getElements(elements1);

	}

}
