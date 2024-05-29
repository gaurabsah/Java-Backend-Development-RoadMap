package basic;

/*
Thread can interrupt a sleeping or waiting Thread by using interrupt()(break off)
method of Thread class.

If the target Thread is not in sleeping or waiting state then interrupt call will
wait until target Thread will enter into sleeping or waiting state. Once target
Thread entered into sleeping or waiting state it will effect immediately
 */

class MyClass extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {

				System.out.println("Lazy Child Thread- " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread got interrupted...");
		}
	}
}

public class ThreadInterrupt {
	public static void main(String[] args) {

		MyClass t = new MyClass();
		t.start();
		t.interrupt();

		System.out.println("End of Main Thread");

	}

}
