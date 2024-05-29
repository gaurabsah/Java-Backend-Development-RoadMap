package basic;

/*
yield() : to pause current executing Thread for giving the chance of remaining waiting Threads of same priority

join() : If a Thread wants to wait until completing some other Thread then we should
go for join() method.
Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until completing t2.

sleep() : If a Thread don't want to perform any operation for a particular amount of time then
we should go for sleep() method.
 */

class Me extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
//			Thread.yield(); // to pause current executing Thread for giving the chance of remaining waiting Threads of same priority
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread- " + i);
		}
	}

}

public class MethodsToPreventThreadFromExecution {
	public static void main(String[] args) throws InterruptedException {

		Me m = new Me();
		m.start();
		m.join(); // If a Thread wants to wait until completing some other Thread then we should
					// go for join() method.
// Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until completing t2.
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread: " + i);
		}

	}

}
