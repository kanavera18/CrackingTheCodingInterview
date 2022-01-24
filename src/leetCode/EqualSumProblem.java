package leetCode;

public class EqualSumProblem {

	public static void main(String[] args) {

		int[] array= new int[] {1,3,5,9};

		System.out.println(equalSumProblem(array));

	}


	/**
	 * This function used subset problem to find if subset sum exists.
	 * @param array
	 * @return
	 */
	private static boolean equalSumProblem(int[] array) {

		int sum= 0;

		// Counting sum of array
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}

		if(sum%2 !=0) {
			return false;
		}

		else{
			return SubsetSumProblem.subsetProblem(array, sum/2);

		}
	}

}
