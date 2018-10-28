package com.core.java.thread.evenodd;

public class PrintNumber {

	private boolean flag = false;

	public synchronized void printOdd(int number) throws InterruptedException {

		if (flag == false) {
			wait();
		}
		if (number % 2 != 0)
			System.out.println("Odd :" + number);
		flag = false;
		notifyAll();
	}

	public synchronized void printEven(int number) throws InterruptedException {
		if (flag == true) {
			wait();
		}
		if (number % 2 == 0)
			System.out.println("Even :" + number);
		flag = true;
		notifyAll();
	}

}