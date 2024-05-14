package com.turing.codinginterview;

public class StringTest {

	public static void main(String[] args) {
		String c = "Hello I am practicing Java";
		if (c.startsWith("H")) {
			c = c.trim();
			c = c.replace("am", "was");
			c = c.substring(3, 5);
			byte[] b = c.getBytes();
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
		System.out.println(c);
	}

}
