package com.core.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable {

	public static void main(String[] args) throws Exception {

		ExecutorService service = Executors.newFixedThreadPool(5);
		Callable<String> c = () -> {
			throw new Exception("Exception Occured");
		};

		try {
			c.call();
			Future<String> future = service.submit(c);
			System.out.println(future.get());
		} catch (Exception e) {
			System.out.println("Exception Occured in Catch");
		}
		

		

		service.shutdown();
	}

}
