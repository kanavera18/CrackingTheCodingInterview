package strings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

	public static void main(String[] args) {

		System.out.println(funcWithDS("kanav"));
		System.out.println(funcWithDS("kanav"));
		System.out.println(funcWithoutDS("kanav"));
		System.out.println(funcWithoutDSBook("kanav"));

	}


	/**
	 * Function to define if input string contains duplicate with using data structures.
	 * 
	 * @param string
	 * @return
	 */
	private static boolean funcWithDS(String string) {

		Set<Character> set= new HashSet<>();
		for(int i=0; i< string.length(); i++) {
			set.add(string.charAt(i));
		}

		return set.size() != string.length() ? false: true;

	}

	/**
	 * Function to define if input string contains duplicate without using data structures.
	 * 
	 * @param string
	 * @return
	 */
	private static boolean funcWithoutDS(String string) {

		for(int i=0; i< string.length() -1; i++) {
			if(string.indexOf(string.charAt(i), i+1) != -1) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Function to define if input string contains duplicate without using data structures. Book
	 * 
	 * @param string
	 * @return
	 */
	private static boolean funcWithoutDSBook(String string) {

		if(string.length() > 128) {
			return false;
		}

		boolean[] charSet= new boolean[128];

		for(int i=0; i< string.length(); i++) {

			if(charSet[string.charAt(i)]) {
				return false;
			}
			else {
				charSet[string.charAt(i)]=true;
			}
		}

		return true;
	}

}
