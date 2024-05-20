package strings;

import java.util.Stack;

public class BalancedParentheses {

	static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		char[] ch = s.toCharArray();

		for (Character ele : ch) {
			if (ele == '(' || ele == '[' || ele == '{') {
				stack.push(ele);
			} else if (ele == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ele == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (ele == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false; // when cases like }}, )), ([}}]) this will return false
			}

		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "([}}])";
		boolean isBalanced = isValid(s);
		if (isBalanced) {
			System.out.println("Balanced/Valid Parentheses");
		} else {
			System.out.println("Not Balanced/InValid Parentheses");
		}
	}

}
