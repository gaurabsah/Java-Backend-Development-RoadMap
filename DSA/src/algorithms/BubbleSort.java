package algorithms;

import java.util.Arrays;

public class BubbleSort {

	static void sort(int[] arr) {
		int n = arr.length;
		int temp;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 33, 22, 99, 56 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
