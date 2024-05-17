package arrays;

import java.util.Arrays;

public class Sort012 {

	static void sort(int[] arr) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		int temp;

		while (mid <= end) {
			if (arr[mid] == 0) {
//				swap
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
//				swap
				temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 2, 0, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
