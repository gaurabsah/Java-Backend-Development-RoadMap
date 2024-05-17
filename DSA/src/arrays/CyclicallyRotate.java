package arrays;

import java.util.Arrays;

public class CyclicallyRotate {

	static void rotate(int[] arr, int k) {
		swap(arr, 0, arr.length - 1);
		swap(arr, 0, k - 1);
		swap(arr, k, arr.length - 1);

	}

	static void swap(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 44, 22, 66, 55, 99, 77 };
		int rotateBy = 10;
		rotate(arr, rotateBy);
		System.out.println(Arrays.toString(arr));
	}

}
