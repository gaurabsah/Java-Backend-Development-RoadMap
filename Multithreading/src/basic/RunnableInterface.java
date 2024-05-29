package basic;

// Runnable mechanism is recommended to define a Thread.

class B implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread-inside Run() : " + i);
		}

	}

}

public class RunnableInterface {
	public static void main(String[] args) {

		B b = new B();
//		b.run(); // run as normal method
		Thread t = new Thread();
		t.start(); // new thread will be created and it will print only main method but not run method because run() is not overriden
//		t.run(); // it will print only main method but not run method because run() is not overriden

		Thread myThread = new Thread(b); // here b is target runnable
//		myThread.start(); // new thread will be created
		myThread.run(); // run as normal method and no new thread

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread- : " + i);
		}

	}

}
