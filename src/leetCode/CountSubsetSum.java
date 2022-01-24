package leetCode;

import CtCILibrary.AssortedMethods;

public class CountSubsetSum {

	public static void main(String[] args) {

		int[] array= new int[] {2,3,5,6,8,10};

		System.out.println(countSubsetSum(array,10));

	}

	/**
	 * @param array
	 * @param sum
	 * @return
	 */
	private static int countSubsetSum(int[] array, int sum) {

		int[][] matrix= new int[array.length +1][sum+1];

		for(int i=0; i<array.length + 1; i++) {
			matrix[i][0]=1;
		}

		for(int i=1; i < sum+1; i++) {
			matrix[0][i]=0;
		}

		AssortedMethods.printMatrix(matrix);
		System.out.println("------------------------------------------------");
		for(int i=1; i< array.length +1; i++) {
			for(int j=1; j < sum+1; j++) {
				if(array[i-1] <=j) {
					matrix[i][j] = matrix[i-1][j-array[i-1]] + matrix[i-1][j];   
				}
				else {
					matrix[i][j] = matrix[i-1][j];   
				}
			}
		}
		
		AssortedMethods.printMatrix(matrix);

		return matrix[array.length][sum];

	}

}
