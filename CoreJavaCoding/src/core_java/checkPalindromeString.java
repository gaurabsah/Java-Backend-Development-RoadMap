package core_java;

public class checkPalindromeString {

	public static void main(String[] args) {

		System.out.println(checkPalindromeStr("MOM"));
		
		System.out.println(checkPalindromeStr("SON"));

	}

	static boolean checkPalindromeStr(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}

}
