package co.cf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // Thread by extension ThreadByExtension thxt = new ThreadByExtension();
		 * thxt.start();
		 * 
		 * // Thread by implementation ThreadByImpl thim = new ThreadByImpl(); Thread
		 * thimThread = new Thread(thim); thimThread.start();
		 */

		// Executor Services Example

		ExecutorService execSvcFxd = Executors.newFixedThreadPool(10);
		List<Future<String>> execSvcFxdThreadList = new ArrayList<Future<String>>();

		Callable<String> callable = new ThreadSumAndSleep("DJ-1", 43, 1500);

		for (int i = 0; i < 24; i++) {

			Future<String> future = execSvcFxd.submit(callable);
			execSvcFxdThreadList.add(future);

		}

		for (Future<String> fut : execSvcFxdThreadList) {
			try {
				System.out.println(new Date() + " : " + fut.get());
			} catch (InterruptedException | ExecutionException iee) {
				iee.printStackTrace();
			}
		}

		execSvcFxd.shutdown();

	}

}
