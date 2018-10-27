package com.core.java.thread.read.write.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class ThreadReadFile implements Runnable {

	private BlockingQueue<String> readBlockingQueue;

	public ThreadReadFile(BlockingQueue<String> blockingQueue) {
		this.readBlockingQueue = blockingQueue;

	}

	@Override
	public void run() {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(new File(System.getProperty("user.dir")+"/"+"Input.properties"));
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null ) {
				System.out.println(line);
				readBlockingQueue.put(line);
				line = bufferedReader.readLine();
			}
			readBlockingQueue.put("EOF");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}