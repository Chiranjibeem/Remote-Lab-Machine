package com.core.java.thread.read.file;

public class FileReaderClient {

	public static void main(String[] args) throws InterruptedException {

		int j = 0;
		for (int i = 0; i < 3; i++) {
			j = j + 2;
			ThreadReadFile readFile = new ThreadReadFile(j);
			Thread readThread = new Thread(readFile, "Thread :" + (i + 1));
			readThread.start();
			readThread.join();

		}

		ThreadReadFile.closeStream();

	}

}
