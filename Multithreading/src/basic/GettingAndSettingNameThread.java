package basic;

class T extends Thread {

}

public class GettingAndSettingNameThread {
	public static void main(String[] args) {
		System.out.println("Main Thread Name: " + Thread.currentThread().getName());
		T t = new T();
		System.out.println("Child Thread Name: " + t.getName());
		t.getName();
		t.setName("Gaurab");
		System.out.println("Child Thread Name: " + t.getName());

		// set name of main thread
		Thread.currentThread().setName("Main Thread");
		System.out.println(Thread.currentThread().getName());
	}

}
