package com.multithreading;

public class TwoThread implements Runnable {

	private OneTwoPrint print;

	public TwoThread(OneTwoPrint print) {
		this.print = print;
	}

	public OneTwoPrint getPrint() {
		return print;
	}

	public void setPrint(OneTwoPrint print) {
		this.print = print;
	}

	@Override
	public void run() {
		try {
			print.prinTwo(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
