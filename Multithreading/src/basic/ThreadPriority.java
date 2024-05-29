package basic;

/*
1. Thread. MIN_PRIORITY----------1
2. Thread. MAX_PRIORITY----------10
3. Thread. NORM_PRIORITY--------5
 */

class Tp extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread- " + i);
		}
	}

}

public class ThreadPriority {
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getPriority()); // 5
//		Thread.currentThread().setPriority(9);
//		Tp t = new Tp();
//		System.out.println(t.getPriority()); // 9

		Tp t = new Tp();
		t.setPriority(10);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread- " + i);
		}

	}
	
/*
If we are commenting line 1 then both main and child Threads will have the
same priority and hence we can't expect exact execution order.
 If we are not commenting line 1 then child Thread has the priority 10 and main
Thread has the priority 5 hence child Thread will get chance for execution and
after completing child Thread main Thread will get the chance in this the output
is:


Some operating systems(like windowsXP) may not provide proper support for Thread
priorities. We have to install separate bats provided by vendor to provide support for
priorities
 */

}
