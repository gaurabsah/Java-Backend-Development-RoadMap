package StackQueue;

import java.util.Stack;

public class PreviousGreaterElement {

	static void previousSmaller(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(st.peek());
			}

			st.push(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 10, 5, 8, 20, 15, 3, 12 };

		previousSmaller(arr);
	}

}
