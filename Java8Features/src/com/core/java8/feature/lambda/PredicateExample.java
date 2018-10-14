package com.core.java8.feature.lambda;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static boolean checkEvenOrOdd(Integer i) {
		
		Predicate<Integer> predicate = (j)->j%2==0;
		return predicate.test(i);
	}

	public static void main(String[] args) {
		
		System.out.println(checkEvenOrOdd(8));
		System.out.println(checkEvenOrOdd(9));

	}

}
