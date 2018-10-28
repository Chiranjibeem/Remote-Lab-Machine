package com.core.java8.feature.lambda;

import java.util.ArrayList;
// Java code to illustrate 
// Fail Fast Iterator in Java 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class FailFastExample {

	static boolean isExist(String element) {
		Predicate<String> elements = (e) -> e.equalsIgnoreCase("Chintu");
		return elements.test(element);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Map<String, String> cityCode = new HashMap<String, String>();
		// Fail Fast Iterator
		// If we comment above line and uncomment below line we will get runtime
		// exception
		// concurrent modification exception
		// instead of taking HashMap if we will use CpncurrentHashMap we wont get this
		// exception
		Map<String, String> cityCode = new ConcurrentHashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator<String> iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}

		CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<>();
		// ArrayList<String> cp = new ArrayList<>();
		//cp.add("Chintu");
		cp.add("Pintu");
		cp.add("Mantu");
		cp.add("Rintu");

		Iterator<String> itr = cp.iterator();

		while (itr.hasNext()) {
			String s = itr.next();
			if (isExist(s)) {
				cp.remove("Chintu");
				cp.add("Chintu123");
			}

		}

		System.out.println(cp);

	}
}