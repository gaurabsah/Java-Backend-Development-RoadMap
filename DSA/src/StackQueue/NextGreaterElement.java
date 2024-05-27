package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	static int[] nextGreatersElement(int[] a) {
		int n = a.length;
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = -1;
		}
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for (int i = 1; i < n; i++) {
			// int top=st.peek();
			while (!st.empty() && a[st.peek()] < a[i]) {
				b[st.peek()] = a[i];
				st.pop();
			}
			st.push(i);
		}
		return b;
	}

	public static void main(String[] args) {
//		int[] num1 = { 4, 1, 2 };
		int[] num2 = { 1, 3, 4, 2 };
		int[] nextGreatersElement = nextGreatersElement(num2);
		System.out.println(Arrays.toString(nextGreatersElement));

	}

}
