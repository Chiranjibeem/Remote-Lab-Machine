package com.core.java.thread.evenodd;

public class EvenOddThread implements Runnable {

	private PrintNumber print;

	private int minNumber;

	private int maxNumber;

	private String number;

	public EvenOddThread(PrintNumber print, int minNumber, int maxNumber, String number) {
		this.print = print;
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
		this.number = number;
	}

	@Override
	public void run() {
		while (minNumber <= maxNumber) {

			if (number.equals("EVEN")) {
				try {
					print.printEven(minNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					print.printOdd(minNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			minNumber += 1;
		}
	}

}
