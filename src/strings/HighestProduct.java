package strings;

import java.util.Arrays;

public class HighestProduct {

	public static void main(String[] args) {
		int[] A = new int[] {0, -1, 3, 100, -70, -50};
		System.out.println(sample(A));
	}

	private static int sample(int[] A) {
		
		Arrays.sort(A);		
		
		int max= A[A.length-1] * A[A.length-2] * A[A.length-3];
		
		int maxNegative= A[0] * A[1] * A[A.length-1];
				
		return Math.max(max, maxNegative);

	}
	

}
