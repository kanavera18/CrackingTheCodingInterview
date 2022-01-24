package leetCode;

public class MinSubsetWithGivenDifference {

	public static void main(String[] args) {

		int[] array= new int[] {2,3,5,6,8};

		System.out.println(minSubset(array, 2));

	}

	private static int minSubset(int[] array, int diff) {

		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}

		int sumTobeFound= (diff + sum)/2;

		System.out.println(sumTobeFound);

		return CountSubsetSum.countSubsetSum(array, sumTobeFound);
	}

}
