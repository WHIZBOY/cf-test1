package co.cf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutorScheduledThreadPool {
	ExecutorService execSvc1 = Executors.newScheduledThreadPool(10);

	Future fut1 = execSvc1.submit(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("From execSvc1 ");
		}
	});

	

	
	//if (fut1.get().equals(null)) {System.out.println("fut1 success "));
	
}
