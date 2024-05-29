package basic;

class A extends Thread {
	
//	always override run methods otherwise don't go for multithreading
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread :no-args " + i);
		}
	}

	
//	it will not execute as thread class doesn't contains parameterized run method.
	public void run(int t) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread :with-args " + i);
		}
	}
	
//	if you override start method of thread class then
//	it will be executed as normal methods and no thread will be created
	
	public void start() {
		System.out.println("Start method");
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
		
//		System.out.println("Main Method");

	}

}
