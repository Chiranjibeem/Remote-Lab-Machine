package com.core.java.thread.read.write.file;

import java.util.concurrent.ArrayBlockingQueue;

public class FileReadWriteClient {
	
	public static void main(String[] args) {
		
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		
		ThreadReadFile readFile = new ThreadReadFile(queue);
		Thread readThread = new Thread(readFile);
		
		ThreadWriteFile writeFile = new ThreadWriteFile(queue);
		Thread writeThread = new Thread(writeFile);
		
		readThread.start();
		writeThread.start();
		
	}

}
