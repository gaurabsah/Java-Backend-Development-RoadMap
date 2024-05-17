package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthMaxMinElement {
	static int kthMinElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

	static int kthMaxElement(int[] arr, int k) {
		Arrays.sort(arr);
		int n = arr.length;
		return arr[n - k];
	}

	static int kthMinElementHeap(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			minHeap.offer(arr[i]); // top 4->7->10->15->20

		}

		System.out.println(minHeap.peek());

		for (int i = 0; i < k - 1; i++) {
			minHeap.poll(); // removes smaller values
		}

		System.out.println(minHeap.peek());

//		int n = k - 1;
//		while (n > 0) {
//			minHeap.remove();
//			n--;
//		}
//
//		System.out.println("Min Element: "+minHeap.peek());

		return minHeap.poll();

	}

	static int kthMaxElementHeap(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
		for (int i = 0; i < arr.length; i++) {
			maxHeap.offer(arr[i]); // top 20->15->10->7->4
		}
		System.out.println(maxHeap.peek());

		for (int i = 0; i < k - 1; i++) {
			maxHeap.poll(); // removes large values
		}
		System.out.println(maxHeap.peek());

//		int n = k - 1;
//		while (n > 0) {
//			maxHeap.remove();
//			n--;
//		}
//
//		System.out.println("Max Element: " + maxHeap.peek());

		return maxHeap.poll();

	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 20, 15 };
		int k = 4;

		System.out.println(Arrays.toString(arr));
		int ans = kthMinElement(arr, k);
//		System.out.println(Arrays.toString(arr));
		System.out.println("Min Element: " + ans);

		int result = kthMaxElement(arr, k);
//		System.out.println(Arrays.toString(arr));
		System.out.println("Max Element: " + result);

		int kthMinElementHeap = kthMinElementHeap(arr, k);
		System.out.println("Min Element: " + kthMinElementHeap);

		int kthMaxElementHeap = kthMaxElementHeap(arr, k);
		System.out.println("Max Element: " + kthMaxElementHeap);

	}

}
