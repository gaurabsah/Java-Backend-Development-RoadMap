package core_java;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Gaurab";
		System.out.println(reverseStr(str));
	}

	private static String reverseStr(String str) {
		char[] strArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
//		sb.append(str).reverse();

		for (int i = strArr.length - 1; i >= 0; i--) {
			sb.append(strArr[i]);
		}

		return sb.toString();
	}

}
