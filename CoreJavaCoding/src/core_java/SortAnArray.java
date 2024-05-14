package core_java;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, -1, -2, 4 };

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
	}

}
