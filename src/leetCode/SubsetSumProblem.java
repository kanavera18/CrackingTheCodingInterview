package leetCode;

public class SubsetSumProblem {

	public static void main(String[] args) {

		int[] array= new int[] {2,3,5,9,11};

		System.out.println(subsetProblem(array,11));
	}

	/**
	 * Subset sum problem using tabulation technique 
	 * 
	 * @param array
	 * @param i
	 */
	public static boolean[][] subsetProblem(int[] array, int sum) {

		boolean[][] matrix= new boolean[array.length+1][sum+1];

		// base code

		for(int i=0; i<matrix.length; i++) {
			matrix[i][0] = true;
		} 

		for(int i=1; i < matrix[0].length; i++) {
			matrix[0][i] =false;
		}

		// Code implementation

		for(int i=1; i<array.length +1; i++) {			
			for(int j=1; j < sum+1; j++) {

				if(array[i-1] <= j) {
					matrix[i][j] = matrix[i-1][j-array[i-1]] || matrix[i-1][j];
				}
				else {
					matrix[i][j]= matrix[i-1][j];
				}
			}
		}

		//return matrix[array.length][sum];
		return matrix;
	}


	/**
	 * Subset sum problem using tabulation technique. This method will return boolean. 
	 * 
	 * @param array
	 * @param i
	 */
	public static boolean subsetProblemReturnBoolean(int[] array, int sum) {

		boolean[][] matrix= new boolean[array.length+1][sum+1];

		// base code

		for(int i=0; i<matrix.length; i++) {
			matrix[i][0] = true;
		} 

		for(int i=1; i < matrix[0].length; i++) {
			matrix[0][i] =false;
		}

		// Code implementation

		for(int i=1; i<array.length +1; i++) {			
			for(int j=1; j < sum+1; j++) {

				if(array[i-1] <= j) {
					matrix[i][j] = matrix[i-1][j-array[i-1]] || matrix[i-1][j];
				}
				else {
					matrix[i][j]= matrix[i-1][j];
				}
			}
		}

		return matrix[array.length][sum];
	}

}
