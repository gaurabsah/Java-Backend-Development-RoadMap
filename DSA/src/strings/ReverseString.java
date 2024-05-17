package strings;

import java.util.Stack;

public class ReverseString {

	static String reverseStr(String str) {
		if (str == null || str.equals("")) {
			return str;
		}
		
//		using String Builder
//		StringBuilder sb = new StringBuilder();
//		sb.append(str);
//		sb.reverse();
//
//		return sb.toString();

//		using char array
//		char[] charArr = str.toCharArray();
//		for (int i = charArr.length - 1; i >= 0; i--) {
//			System.out.print(charArr[i]);
//		}

//		using Stack
		Stack<Character> stack = new Stack<Character>();

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			stack.push(ch[i]);
		}

		int k = 0;
		while (!stack.isEmpty()) {
			ch[k++] = stack.pop();
//			k++;
		}

		return String.copyValueOf(ch);

	}

	public static void main(String[] args) {
		String str = "Gaurab Sah";
		String s = reverseStr(str);
		System.out.println(s);
	}

}
