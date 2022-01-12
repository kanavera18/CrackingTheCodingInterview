package leetCode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstLastPosSortedArray {

	public static void main(String[] args) {
		int[] array= new int[]{5,7,7,8,8,10};

		System.out.println(firstLastPos(array, 6));

	}

	private static int[] firstLastPos(int[] array, int i) {

		int[] result= new int[2];

		List<Integer> listInteger=	IntStream.of(array)
				.boxed()
				.collect(Collectors.toList());


		result[0]=listInteger.indexOf(i);
		result[1]=listInteger.lastIndexOf(i);

		return result;

	}

}
