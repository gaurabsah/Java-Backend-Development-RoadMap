package basic;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread- " + i);
		}
	}
}

public class LifeCycleOfThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		mt.start(); // will throw IllegalThreadStateException because thread is in dead state
	}
	
/*
 ----- Thread Life Cycle
 1. New/born state: When we create object of class which extends Thread Class
    MyThread mt = new MyThread();
    
 2. Ready/Runnable: When object reference of a class is invoked with method of Thread class
    mt.start();
    
 3. Running: If Thread Scheduler allocated CPU then it is in running state
 
 4. Dead: If thread completes run() methods then it becomes dead
    public void run() {}
 */

}
