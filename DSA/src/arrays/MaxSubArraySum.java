package arrays;

// Kadane's Algorithm

public class MaxSubArraySum {

//	Brute-force
	static int subarraySumBrute(int[] arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				maxSum = Math.max(maxSum, sum); // getting the maximum
			}
		}

		return maxSum;

	}

//	Optimal
	static int subarraySum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
			if (sum > max) {
				max = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}

		return max;

	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int subarraySum = subarraySum(arr);
		int subarraySumBrute = subarraySumBrute(arr);
		System.out.println(subarraySumBrute);
	}

}
