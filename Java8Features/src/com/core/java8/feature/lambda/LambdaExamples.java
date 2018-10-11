package com.core.java8.feature.lambda;

public class LambdaExamples {

	@FunctionalInterface
	interface _1Lambda {

		public String printMessage(String name);
	}

	@FunctionalInterface
	interface _2Lambda {

		public int add(int a, int b);
	}

	@FunctionalInterface
	interface _3Lambda {
		public int square(int n);
	}

	@FunctionalInterface
	interface _4Lambda {
		public void m1();

		default void square(int n) {
			System.out.println("Square :"+n * n);
		}

		static void multiplication(int n, int j) {
			System.out.println("Multiplication :"+n*j);
		}
	}

	static class _1Lambda1 {

		public static void main(String[] args) {

			_1Lambda lambda = (name) -> {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Running Inside Lambda :" + i);
				}
				return "Hello" + " : " + name;
			};
			System.out.println(lambda.printMessage("Chintu"));

			_2Lambda lambda2 = (a, b) -> {
				return a + b;
			};

			System.out.println(lambda2.add(10, 5));

			_3Lambda lambda3 = n -> n * n;
			System.out.println(lambda3.square(4));

			_4Lambda lambda4 = () -> System.out.println("Hello");
			lambda4.m1();
			lambda4.square(5);
			_4Lambda.multiplication(3, 4);
		}
	}
}
