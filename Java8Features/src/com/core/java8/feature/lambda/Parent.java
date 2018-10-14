package com.core.java8.feature.lambda;

public class Parent {

	static {
		System.out.println("Static Parent");
	}

	{
		System.out.println("Instance Parent");
	}

	public Parent() {
		System.out.println("A");
	}

	public Parent(int i) {
		System.out.println("B");
	}

	public static void main(String[] args) {

		Child c = new Child(5);
	}

}
