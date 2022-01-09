package strings;

import java.util.ArrayList;
import java.util.List;

public class MaxSubSequence {

	public static void main(String[] args) {

		System.out.println(numDistinct("rabbbit"));

	}

	public static int numDistinct(String A) {

		List<Character> list= new ArrayList<>();
		int result=0;

		for(int i=0; i<A.length(); i++) {
			list= new ArrayList<>();
			list.add(A.charAt(i));

			for(int j= i+1 ; j <A.length(); j++) {
				char ch=A.charAt(j);

				if(! list.contains(ch)) {
					list.add(ch);
				}
				else if(list.contains(ch)) {
					break;
				}
			}
			result= Math.max(result, list.size());
		}
		return result;
	}
}
