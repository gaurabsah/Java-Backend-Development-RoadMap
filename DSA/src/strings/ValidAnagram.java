package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();
		for (Character arr : ch) {
			if (map.containsKey(arr)) {
				map.put(arr, map.get(arr) + 1);
			} else {
				map.put(arr, 1);
			}
		}

		char[] c = t.toCharArray();
		for (Character ele : c) {
			if (!map.containsKey(ele)) {
				return false;
			}

			if (map.get(ele) == 1) {
				map.remove(ele);
			} else {
				map.put(ele, map.get(ele) - 1);
			}
		}

		return map.isEmpty();
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean anagram = isAnagram(s, t);
		if (anagram) {
			System.out.println("Valid Anagram");
		} else {
			System.out.println("Not Valid Anagram");
		}
	}

}
