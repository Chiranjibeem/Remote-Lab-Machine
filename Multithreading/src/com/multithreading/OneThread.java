package com.multithreading;

public class OneThread implements Runnable {

	private OneTwoPrint print;

	public OneThread(OneTwoPrint print) {
		this.setPrint(print);
	}

	@Override
	public void run() {
		try {
			print.printOne(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public OneTwoPrint getPrint() {
		return print;
	}

	public void setPrint(OneTwoPrint print) {
		this.print = print;
	}

}
