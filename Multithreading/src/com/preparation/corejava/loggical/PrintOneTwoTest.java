package com.preparation.corejava.loggical;

public class PrintOneTwoTest {
	public static void main(String... args) {
		PrintNumber number = new PrintNumber();
		PrintOneTwoThread one = new PrintOneTwoThread(number, 10, 1);
		PrintOneTwoThread two = new PrintOneTwoThread(number, 10, 2);
		
		new Thread(one).start();
		new Thread(two).start();
		
	}
}