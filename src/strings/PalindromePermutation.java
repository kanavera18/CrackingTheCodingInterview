package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author User
 *
 */
public class PalindromePermutation {

	public static void main(String[] args) {

		System.out.println(checkIfPermPalind("tactcoapapa"));

	}

	/**
	 * Function to check if string is a palindrome or permutation of palindrome
	 * @param string
	 */
	private static boolean checkIfPermPalind(String string) {

		char[] charArray= string.toCharArray();
		boolean flag= false;

		Map<Character,Integer> map= new HashMap<>();

		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);			
		}

		for (int each : map.values()) {
			if(each %2 ==1) {
				if(! flag) {
					flag= true;
				}
				else {
					return false;
				}
			}
		}
		return true; 
	}

}
