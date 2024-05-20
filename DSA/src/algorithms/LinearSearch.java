package algorithms;

public class LinearSearch {

	static int search(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 33, 22, 99, 56 };
		int target = 22;
		int element = search(arr, target);
		System.out.println("The element is at index: " + element);
	}

}
