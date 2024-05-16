package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of integers, 
 * find out all the even numbers that exist in the list using Stream functions?
 */

public class EvenNumber {
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,15,8,49,25,98,32));
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
//		List<Integer> list2 = list.stream().filter(a->a%2==0).collect(Collectors.toList());
//		System.out.println(list2);
		
		list.stream().filter(a->a%2==0).forEach(System.out::println);
	}

}
