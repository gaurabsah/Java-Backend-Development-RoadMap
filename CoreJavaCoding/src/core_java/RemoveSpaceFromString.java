package core_java;

public class RemoveSpaceFromString {
	
	public static void main(String[] args) {
		
		System.out.println(removeWhiteSpaces(" a bc "));
		
	}
	
	static String removeWhiteSpaces(String input) {
//		StringBuilder output = new StringBuilder();
//		
//		char[] charArray = input.toCharArray();
//		
//		for (char c : charArray) {
//			if (!Character.isWhitespace(c))
//				output.append(c);
//		}
//		
//		return output.toString();
		
		return input.replace(" ", "");
	}

}
