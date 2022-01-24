package leetCode;

public class KnapsackTabulation {

	public static void main(String[] args) {

		int[] wt= new int[] {3,5};
		int[] value= new int[] {1,8};

		System.out.println(knapsackProblem(wt,value,10,2));

	}

	/**
	 * Recursive approach to find maximum value, corresponds to which weight is getting adjusted in a knapsack of 
	 * value 10 kg  
	 * @param wt
	 * @param value
	 * @param W
	 * @param n
	 * @return
	 */
	private static int knapsackProblem(int[] wt, int[] value, int W, int n) {

		int[][] matrix= new int[n+1][W+1];

		// Base Condition

		for(int i=0; i<n; i++ ) {
			for(int j=0; j<W; j++) {
				if(n==0 || W==0) {
					matrix[i][j] =0;
				}	
			}
		}

		// Code
		for(int i=1; i < n+1; i++) {
			for(int j=1; j < W+1; j++) {
				if(wt[i-1] <= j) {
					matrix[i][j]= Math.max(value[i-1] + matrix[i-1][j-wt[i-1]], matrix[i-1][j]);
				}
				else {
					matrix[i][j]=  matrix[i-1][j];
				}				
			}
		}		
		return matrix[n][W];

	}

}
