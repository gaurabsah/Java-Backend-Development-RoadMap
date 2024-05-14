package core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsOnlyOddNumbers {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		System.out.println(onlyOddNumbers(list1));
		System.out.println(onlyOddNumbers(list2));

	}

	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}

		return true;
	}
	
//	If the list is large, you can use parallel stream for faster processing
	
	public static boolean onlyOddNumber(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

}
