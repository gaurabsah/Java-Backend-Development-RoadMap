package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * How to use map to convert object into Uppercase in Java 8?
 */

public class ObjectIntoUppercase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("aa", "bb", "cc");

		List<String> nameLst = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(nameLst);
	}

}
