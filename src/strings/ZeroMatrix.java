package strings;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

	public static void main(String[] args) {

		int[][] matrix= new int[][]{{8,7,5,3},{7,0,7,4},{9,9,1,5},{6,7,5,8}}; 

		zeroMatrix(matrix);

	}

	private static void zeroMatrix(int[][] matrix) {

		Set<Integer> rows= new HashSet<>();
		Set<Integer> columns= new HashSet<>();

		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j < matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}

		// nullify rows
		for(Integer each : rows) {
			for(int i=0; i < matrix[0].length; i++) {
				matrix[each][i] = 0;
			}	
		}

		// nullify columns
		for(Integer each : columns) {
			for(int i=0; i < matrix.length; i++) {
				matrix[i][each] = 0;
			}	
		}

		System.out.println(matrix);

	}

}
