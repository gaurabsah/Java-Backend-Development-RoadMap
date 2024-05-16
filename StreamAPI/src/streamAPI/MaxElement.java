package streamAPI;

import java.util.Arrays;

/*
 * Write a Program to find the Maximum element in an array?
 */

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = { 12, 19, 20, 88, 00, 9 };
		System.out.println(Arrays.stream(arr).max().getAsInt());
	}

}
