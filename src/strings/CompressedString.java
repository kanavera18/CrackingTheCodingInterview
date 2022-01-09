package strings;

/**
 * @author User
 * Kanav Sharma
 */
public class CompressedString {

	public static void main(String[] args) {

		System.out.println(stringCompress("aabcccccaaa"));

	}

	/**
	 * Compressing string using String Builder
	 * @param string
	 * @return
	 */
	private static String stringCompress(String string) {

		StringBuilder sb= new StringBuilder();

		for(int i=0; i< string.length(); i++) {
			sb.append(string.charAt(i));
			int charcCount=1;
			while(i+1 < string.length() && string.charAt(i+1) == string.charAt(i)) {
				charcCount++;
				i++;
			}
			sb.append(charcCount);
		}
		return sb.toString();

	}

}
