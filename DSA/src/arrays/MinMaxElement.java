package arrays;

import java.util.Arrays;

public class MinMaxElement {

	static int[] minMax(int[] arr) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int[] res = new int[2];

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
				res[0] = min;
			} else if (arr[i] > max) {
				max = arr[i];
				res[1] = max;
			}

		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 22, 77, 44, 99, 33 };
		int[] minMax = minMax(arr);
		System.out.println(Arrays.toString(minMax));
	}

}
