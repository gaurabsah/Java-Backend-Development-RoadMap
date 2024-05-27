package StackQueue;

import java.util.Stack;

public class ConvertInfixExpressionToPostfixExpression {

	static String convert(String s) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetterOrDigit(ch[i])) {
				sb.append(ch[i]);
			} else if (ch[i] == '(') {
				stack.push(ch[i]);
			} else if (ch[i] == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}

				stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch[i])) {
					sb.append(stack.pop());
				}
				stack.push(ch[i]);
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}

	public static int precedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		String s = "a+b*(d+e)";
		String postfix = convert(s);
		System.out.println(postfix);
	}

}
