package com.turing.codinginterview;

class TestA implements Runnable {
	TestB testB = TestB.test;

	@Override
	public void run() {
		testB.notify();

	}
}

public class TestB implements Runnable {

	private String str = "Old";
	public static TestB test;

	@Override
	public void run() {
		test = new TestB();
		try {
			test.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.str = "New ";
		System.out.println(test.str);
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new TestA());
		Thread t2 = new Thread(new TestB());
		t1.start();
		t2.start();
		System.out.println("World");
	}

}
