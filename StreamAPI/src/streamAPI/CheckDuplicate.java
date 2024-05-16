package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Given an integer array nums,
 * return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */

public class CheckDuplicate {

	public static boolean containsDuplicate(int[] num) {
		List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 1, 3 };
		boolean containsDuplicate = containsDuplicate(num);

		if (containsDuplicate) {
			System.out.println("Contains Duplicate");
		} else {
			System.out.println("Doesn't contains Duplicate");
		}

	}

}
