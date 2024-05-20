package strings;

public class CheckPalindrome {

	static boolean checkPalindrome(String str) {
		if (str == null || str.equals("")) {
			return false;
		}

//		using String Builder
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String revStr = sb.toString();

		if (str.equals(revStr)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String str = "MADAM";
		boolean isPalindrome = checkPalindrome(str);
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
