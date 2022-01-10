package strings;

/**
 * @author User
 * Kanav Sharma
 *
 */
public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix= new int[][]{{8,7,5,3},{7,0,7,4},{9,9,1,5},{6,7,5,8}};

		rotateMatrix(matrix);

	}

	/**
	 * Logic to rotate N * N matrix by 90 Degree
	 * @param matrix
	 * @return
	 */
	private static boolean rotateMatrix(int[][] matrix) {

		System.out.println(matrix);

		int[][] resultMatrix= new int[matrix.length][matrix[0].length];

		if(matrix.length ==0 || matrix[0].length != matrix.length) {
			return false;
		}

		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				resultMatrix[j][resultMatrix[0].length - 1 -i]=matrix[i][j];
			}
		}

		System.out.println(resultMatrix);

		return false;


	}

}
