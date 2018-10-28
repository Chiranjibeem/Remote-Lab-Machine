package test;

public class ThreadTest implements Runnable {

	private int total = 0;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		synchronized (this) {
			this.notifyAll();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadTest test = new ThreadTest();
		Thread thread = new Thread(test);
		thread.start();
		synchronized (thread) {
			thread.wait();	
		}
		
		
		System.out.println(test.getTotal());
	}

}
