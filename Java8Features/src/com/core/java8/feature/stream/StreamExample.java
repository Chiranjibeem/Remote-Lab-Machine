package com.core.java8.feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		al.add("Chintu");
		al.add("Pintu");
		al.add("Mantu");
		al.add("Gintu");
		al.add("Chintu");

		List<String> distinctList = al.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList);

		System.out.println(al.stream().anyMatch((e) -> e.startsWith("x")));
		
	}

}
