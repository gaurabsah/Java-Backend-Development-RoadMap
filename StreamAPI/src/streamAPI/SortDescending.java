package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a list of integers, 
 * sort all the values present in it in descending order using Stream functions?
 */

public class SortDescending {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
