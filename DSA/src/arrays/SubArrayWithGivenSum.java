package arrays;

import java.util.Arrays;

public class SubArrayWithGivenSum {

	static int[] subArrayWithSum(int[] arr, int sum) {
		int curSum = 0;
		int start = 0;
		int end = 0;

		int[] res = { -1, -1 };

		for (int i = 0; i < arr.length; i++) {
			curSum = curSum + arr[i];
			if (curSum < sum) {
				end++;
				res[1] = end + 1;
			}

			if (curSum > sum) {
				curSum = curSum - arr[start];
				start++;
				res[0] = start + 1;
			}

			if (curSum == sum) {
				return res;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		int[] subArrayWithSum = subArrayWithSum(arr, sum);
		System.out.println(Arrays.toString(subArrayWithSum));
	}

}
