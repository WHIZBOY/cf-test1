package co.cf;

public class ThreadByExtension extends Thread{

	public void run() {
		for(int i = 0; i <100 ; i++) {
			System.out.println("Thread by Extension number : " + i);
		}
	}
}
