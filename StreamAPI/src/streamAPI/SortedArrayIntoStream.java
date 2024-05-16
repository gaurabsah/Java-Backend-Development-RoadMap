package streamAPI;

import java.util.Arrays;

/*
 * Write a Java 8 program to sort an array and then convert the sorted array into Stream?
 */

public class SortedArrayIntoStream {
	public static void main(String[] args) {
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.parallelSort(arr);
		// Sorted the Array using parallelSort()

		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		/*
		 * Converted it into Stream and then printed using forEach
		 */
	}

}
