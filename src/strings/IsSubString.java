package strings;

/**
 * @author User
 * Kanav Sharma
 */
public class IsSubString {

	public static void main(String[] args) {

		System.out.println(isSubstring("waterbottle","erbottlewat"));

	}

	/**
	 * @param string
	 * @param string2
	 */
	private static boolean isSubstring(String string, String string2) {

		String concatenatedString= string + string;

		if(concatenatedString.indexOf(string2) >=0) {
			return true;
		}    
		else {
			return false;
		}

	}

}
