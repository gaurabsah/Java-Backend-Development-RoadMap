package basic;

// Thread Class implements Runnable Interface internally

class myThreads extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread- " + i);
		}
	}
}

public class ThreadConstructors {
	public static void main(String[] args) {
		myThreads myThread = new myThreads();
		Thread t = new Thread(myThread);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread- " + i);
		}
	}
	
/*
1. Thread t=new Thread();
2. Thread t=new Thread(Runnable r);
3. Thread t=new Thread(String name);
4. Thread t=new Thread(Runnable r,String name);
5. Thread t=new Thread(ThreadGroup g,String name);
6. Thread t=new Thread(ThreadGroup g,Runnable r);
7. Thread t=new Thread(ThreadGroup g,Runnable r,String name);
8. Thread t=new Thread(ThreadGroup g,Runnable r,String name,long stackSize);
 */

}
