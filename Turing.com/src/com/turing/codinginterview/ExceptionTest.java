package com.turing.codinginterview;

public class ExceptionTest {

	public Integer divide(int a, int b) {
		try {
			return a / b;
		} finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		try {
			System.out.println(exceptionTest.divide(10, 0));
		} catch (Exception e) {
			System.out.println("Division by 0!");
		}
	}

}
