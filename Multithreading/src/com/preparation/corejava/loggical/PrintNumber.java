package com.preparation.corejava.loggical;

public class PrintNumber {

	private boolean print = false;

	public synchronized void printOne() {
		while (print == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		print = false;
		System.out.println("2");
		notifyAll();
	}

	public synchronized void printTwo() {
		while (print == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		print = true;
		System.out.println("1");
		notifyAll();
	}

}
