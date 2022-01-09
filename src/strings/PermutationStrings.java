package strings;

import java.util.Arrays;

public class PermutationStrings {

	public static void main(String[] args) {

		System.out.println(checkPermutationStrings("dog","god"));

	}

	private static boolean checkPermutationStrings(String string, String string2) {

		if(string.length() != string2.length()) {
			return false;
		}

		return sort(string).equalsIgnoreCase(sort(string2));
	}

	private static String sort(String string) {

		char[] charArray= string.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

}
