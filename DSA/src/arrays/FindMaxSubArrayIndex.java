package arrays;

import java.util.Arrays;

public class FindMaxSubArrayIndex {

	static int[] findIndexSubarray(int[] arr) {
		int start = 0;
		int end = 0;

		int[] res = new int[2];

		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
			if (sum > max) {
				max = sum;
				end = i + 1;
				res[1] = end;
			}

			if (sum < 0) {
				sum = 0;
				start = i + 1;
				res[0] = start;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] findIndesSubarray = findIndexSubarray(arr);
		System.out.println(Arrays.toString(findIndesSubarray));

	}

}
