package arrays;

import java.util.Arrays;

public class MoveAllNegative {

	static void moveAllNegatives(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int temp;

		while (start <= end) {
			if (arr[start] < 0 && arr[end] > 0) {
				start++;
				end--;
			} else if (arr[start] > 0 && arr[end] < 0) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			} else if (arr[start] > 0 && arr[end] > 0) {
				end--;
			} else if (arr[start] < 0 && arr[end] < 0) {
				start++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 23, 4, -2, 33, -44 };
		moveAllNegatives(arr);
		System.out.println(Arrays.toString(arr));
	}

}
