package basic;

class ChildThread extends Thread {

	static Thread t = Thread.currentThread();

	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread- " + i);
		}
	}
}

public class WaitingOfChildThreadUntillCompletingMainThread {
	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
		ChildThread ct = new ChildThread();
		ct.start();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread- " + i);
		}

	}

}
