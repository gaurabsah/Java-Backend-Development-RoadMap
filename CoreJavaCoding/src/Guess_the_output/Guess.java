package Guess_the_output;

import java.io.IOException;
import java.util.HashSet;

public class Guess {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1 == s2 is:" + s1 == s2); // false
//-------------------------------
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;

		System.out.println(s3.substring(start, end)); // ourn
//--------------------------------
		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}

		System.out.println(shortSet.size()); // 100
//--------------------------------		
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally"); // No output. This code results in an infinite loop if the flag is true
												// and the program exists if the flag is false. The finally block will
												// never be reached.
		}
//-------------------------------
		String str = null;
		String str1 = "abc";

		System.out.println(str1.equals("abc") | str.equals(null)); // NullPointerException

//-------------------------------
	String x1 = "abc";
	String y1 = "abc";

	x1.concat(y1);

	System.out.print(x1); // abc
//--------------------------------
	int x = 10 * 10 - 10;

	System.out.println(x);
//---------------------------------
	try
	{
		throw new IOException("Hello");
	}catch(IOException|Exception e)
	{
		System.out.println(e.getMessage());   // This code results in a compile time error. The exception IOException is already caught by the alternative Exception.
	}
//----------------------------------
	/*
	 * Find 5 mistakes
	 * 
	 * 
	 * 
	 * package com.digitalocean.programming-interviews;
	 * 
	 * public class String Programs {
	 * 
	 * static void main(String[10] args) { 
	 * String s = "abc" System.out.println(s); 
	 * }
	 * }
	 * 
	 * The package name can’t have hyphens. 
	 * The class name can’t have spaces. The
	 * main method is not public, so it won’t run. 
	 * The main method argument shouldn’t specify the size. 
	 * The semicolon is missing in the string definition.
	 * 
	 * 
	 */

}
