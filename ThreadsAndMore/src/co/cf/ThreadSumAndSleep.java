package co.cf;

import java.util.concurrent.Callable;

//public class ThreadSumAndSleep implements Runnable {
public class ThreadSumAndSleep implements Callable {
	private String threadName;
	private int count;
	private final long timeSleep;

	ThreadSumAndSleep(String tName, int tCount, long tTimeSleep) {
		this.threadName = tName;
		this.count = tCount;
		this.timeSleep = tTimeSleep;
	}

	//public void run() {
	public String call() {
		int sum = 0;
		for (int i = 1; i < this.count; i++) {
			sum++;
		}

		System.out.println(threadName + " thread summed up to : " + sum + " and is going to sleep for : " + timeSleep);

		try {
			Thread.sleep(this.timeSleep);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		return Thread.currentThread().getName();

	}

}
