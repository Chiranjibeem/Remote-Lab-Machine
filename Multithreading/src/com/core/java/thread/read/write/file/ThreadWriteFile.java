package com.core.java.thread.read.write.file;

import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class ThreadWriteFile implements Runnable {

	private BlockingQueue<String> writeBlockingQueue;
	
	public ThreadWriteFile(BlockingQueue<String> writeBlockingQueue) {
		this.writeBlockingQueue = writeBlockingQueue;
	}

	@Override
	public void run() {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File(System.getProperty("user.dir") + "/" + "Output.properties"));
			while (true) {
				String content = writeBlockingQueue.take();
				if (content.equals("EOF"))
					break;
				pw.write(content+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

}
