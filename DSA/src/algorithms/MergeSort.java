package algorithms;

import java.util.Arrays;

/*
Divide & Conquer
TC-> O(n log n)
 */

public class MergeSort {

	static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Merge the temp arrays

		// Initial indices of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int[] arr, int low, int high) {
		if (low < high) {

			// Find the middle point
			int m = low + (high - low) / 2;

			// Sort first and second halves
			sort(arr, low, m);
			sort(arr, m + 1, high);

			// Merge the sorted halves
			merge(arr, low, m, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 33, 22, 99, 56 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
