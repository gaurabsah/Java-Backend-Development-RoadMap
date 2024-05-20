package algorithms;

/*
The given array must be sorted
 */

public class BinarySearch {

	static int search(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 22, 44, 66, 77, 88, 99, 101, 110 };
		int target = 99;
		int element = search(arr, target);
		System.out.println("The element is at index: " + element);
	}

}
