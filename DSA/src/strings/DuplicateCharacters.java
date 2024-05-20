package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	static void findDuplicate(String str) {
//		using Set
		Set<Character> set = new HashSet<Character>();
//		String lStr = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!set.add(ch[i])) {
				System.out.print(ch[i]);
			}
		}

//		using HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		String s = str.toLowerCase();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

	public static void main(String[] args) {
		String str = "gaurabsah";
		findDuplicate(str);
	}

}
