package arrays;

import java.util.Arrays;

public class ReverseAnArray {

	static void reverseArr(int[] arr) {
		int n = arr.length;

		int start = 0;
		int end = n - 1;
		int temp;

		while (start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] arr = null;
		reverseArr(arr);
		System.out.println(Arrays.toString(arr));
	}

}
