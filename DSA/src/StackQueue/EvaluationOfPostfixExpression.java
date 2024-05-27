package StackQueue;

import java.util.Stack;

public class EvaluationOfPostfixExpression {

	static int evaluatePostfix(String exp) {
		// Create a stack
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			// If the scanned character is an operand
			// (number here), push it to the stack.
			if (Character.isDigit(c))
				stack.push(c - '0');

			// If the scanned character is an operator, pop
			// two elements from stack apply the operator
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;
				case '-':
					stack.push(val2 - val1);
					break;
				case '/':
					stack.push(val2 / val1);
					break;
				case '*':
					stack.push(val2 * val1);
					break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String s = "231*+9-";
		int evaluatePostfix = evaluatePostfix(s);
		System.out.println(evaluatePostfix);
	}

}
