package com.core.java.thread.evenodd;

public class PrintEvenOddTest {
	public static void main(String... args) {
		PrintNumber number = new PrintNumber();
		EvenOddThread even = new EvenOddThread(number, 1, 10,"EVEN");
		EvenOddThread odd = new EvenOddThread(number, 1, 10,"ODD");

		new Thread(even).start();
		new Thread(odd).start();
		
	}
}