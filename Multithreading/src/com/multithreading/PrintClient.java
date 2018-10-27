package com.multithreading;

public class PrintClient {

	public static void main(String[] args) throws InterruptedException {
		OneTwoPrint print = new OneTwoPrint();

		OneThread one = new OneThread(print);
		Thread t1 = new Thread(one);
		t1.start();

		TwoThread two = new TwoThread(print);
		Thread t2 = new Thread(two);
		t2.start();

	}

}
