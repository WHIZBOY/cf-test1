package co.cf;

public class ThreadByImpl implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread by Implementation number : " + i);
		}
	}

}
