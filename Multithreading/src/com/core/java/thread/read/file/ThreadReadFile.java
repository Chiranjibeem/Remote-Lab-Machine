package com.core.java.thread.read.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadReadFile implements Runnable {

	private static int count = 0;

	private int readLine;

	private static BufferedReader bufferedReader;
	private static FileReader fileReader;

	static {
		try {
			fileReader = new FileReader(new File(System.getProperty("user.dir") + "/" + "Input.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		bufferedReader = new BufferedReader(fileReader);
	}

	public static void closeStream() {

		if (fileReader != null) {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (bufferedReader != null) {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public ThreadReadFile(int readLine) {
		this.readLine = readLine;

	}

	@Override
	public void run() {
		//synchronized (ThreadReadFile.class) {
			try {
				String line = bufferedReader.readLine();
				while (line != null) {
					count++;
					System.out.println(line + " : " + Thread.currentThread().getName());
					if (count == readLine) {
						break;
					}
					line = bufferedReader.readLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}

		//}
	}
}