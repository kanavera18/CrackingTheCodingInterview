package leetCode;

import java.util.Arrays;

public class KnapsackK {

	public static void main(String[] args) {

		int[] wt= new int[] {3,5,7, 12};
		int[] value= new int[] {1,8,6,4};

		System.out.println(knapsackProblem(wt,value,10,4));

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
		
		// introduced for memoization
		int[][] matrix= new int[n+1][W+1];
	
		for (int[] each : matrix) {
			Arrays.fill(each, -1);
		}

		if(n == 0 || W == 0) {
			return 0;
		}
				
		if(matrix[n][W] != -1) {
			return matrix[n][W];
		}

		else {
			if(wt[n-1] <= W) {
				return matrix[n][W]= Math.max(value[n-1] + knapsackProblem(wt, value, W-wt[n-1], n-1), 
						knapsackProblem(wt, value, W, n-1)) ;
			}
			else {
				return matrix[n][W]= knapsackProblem(wt, value, W, n-1);
			}
		}
	}

}
