package StackQueue;

import java.util.Stack;

public class ParanthesisChecker {

	static boolean paranthesisChecking(String str) {
		Stack<Character> s = new Stack<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				s.push(ch[i]);
			} else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
				if (s.peek() == '(' && ch[i] == ')') {
					s.pop();
				} else if (s.peek() == '{' && ch[i] == '}') {
					s.pop();
				} else if (s.peek() == '[' && ch[i] == ']') {
					s.pop();
				} else
					return false;
			}
		}
		return s.isEmpty();
	}

	public static void main(String[] args) {
		String str = "(({}))";
		boolean paranthesisChecking = paranthesisChecking(str);
		if (paranthesisChecking) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}

	}

}
