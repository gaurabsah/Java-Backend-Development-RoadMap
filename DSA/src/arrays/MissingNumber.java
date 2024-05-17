package arrays;

public class MissingNumber {
	static int missingNum(int[] arr) {
		int sum = 0;
		int N = arr.length + 1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int missNum = N * (N + 1) / 2 - sum;

		return missNum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int missingNum = missingNum(arr);
		System.out.println(missingNum);
	}

}
