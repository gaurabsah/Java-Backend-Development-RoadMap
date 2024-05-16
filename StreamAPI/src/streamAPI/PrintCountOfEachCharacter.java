package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Write a program to print the count of each character in a String?
 */

public class PrintCountOfEachCharacter {
	public static void main(String[] args) {
		String s = "string data to count each character";
		Map<String, Long> map = Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors
						.groupingBy(str -> str, LinkedHashMap::new, 
								Collectors.counting()));
		
		System.out.println(map);
	}

}
