package basic;

class A extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread : " + i);
		}
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		A threadObj = new A(); // instantiation of a thread
		threadObj.start(); // starting a thread

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread : " + i);
		}

		/*
		 * output depends upon JVM (Thread Scheduler:- which thread will execute first
		 * is decided by Thread Scheduler)
		 */

	}

}
