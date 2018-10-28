package com.preparation.corejava.loggical;

public class PrintOneTwoThread implements Runnable {

	private PrintNumber number;

	private int noOfTimesPrint;

	private int print;

	public PrintOneTwoThread(PrintNumber number, int noOfTimesPrint, int print) {
		this.number = number;
		this.noOfTimesPrint = noOfTimesPrint;
		this.print = print;
	}

	@Override
	public void run() {
		int count = 0;
		while (count <= this.noOfTimesPrint) {
			count++;
			if (this.print == 1)
				number.printOne();
			else
				number.printTwo();
		}

	}
}
