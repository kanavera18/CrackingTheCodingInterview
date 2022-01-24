package leetCode;

import CtCILibrary.AssortedMethods;

public class MinSubsetSumDifference {

	public static void main(String[] args) {

		int[] array= new int[] {2,3,5,6,8};

		System.out.println(minSubsetSumDifference(array));

	}

	/**
	 * Function to provide minimum difference between two subsets of a given array
	 * 
	 * S1 - S2 to be minimized
	 * (Sum - S2) - S2 to be minimized
	 * (Sum -2S2) to be minimized
	 * 
	 * We used subset sum difference to get true and false if sum is required.
	 * 
	 * @param array
	 * @return
	 */
	private static int minSubsetSumDifference(int[] array) {

		int sum=0;
		int min= Integer.MAX_VALUE;

		for(int i=0; i < array.length ; i++) {
			sum+=array[i];	
		}

		boolean[][] matrix= SubsetSumProblem.subsetProblem(array, sum);

		AssortedMethods.printMatrix(matrix);

		for(int i=1; i< matrix[5].length/ 2 ;i++) {
			if(matrix[5][i] == true) {
				min= Math.min(min, sum- (2*i));
			}			
		}
		System.out.println("Min Value" + min);

		return min;
	}

}
