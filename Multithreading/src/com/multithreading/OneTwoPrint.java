package com.multithreading;

public class OneTwoPrint {

	public void printOne(int x) throws InterruptedException {

		for (int i = 1; i <= x; i++) {
			synchronized (this) {
				System.out.println("Print : "+x);
				this.wait();
			}
		}
		this.notify();
	}

	public void prinTwo(int x) throws InterruptedException {

		for (int i = 1; i <= x; i++) {
			synchronized (this) {
				System.out.println("Print : "+x);
				this.wait();
			}
		}
		this.notify();
	}

}
