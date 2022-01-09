package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubSequence {

	public static void main(String[] args) {

		int[] arr= new int[] {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

		sample(arr);

	}

	private static void sample(int[] arr) {

		int[] temp = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);

		List<Integer> listInteger=IntStream.of(arr)
				.boxed().collect(Collectors.toList());

		Set<List<Integer>> finalList= new HashSet<>();

		List<Integer> firstList= new ArrayList<>();
	//	firstList.add(temp[0]);

		for(int i=0; i<temp.length; i++) {
			int indexI=listInteger.indexOf(i);
			for(int j=1; j < temp.length; j++) {
				int indexJ=listInteger.indexOf(j);
				if(j==1) {
					firstList.add(indexJ < indexI? temp[j]: temp[i]);
					finalList.add(firstList);
					continue;
				}
				else if(indexJ < listInteger.indexOf(j-1) && indexJ > indexI) {
					firstList.add(temp[j]);
					finalList.add(firstList);
				}
				else if(indexJ > listInteger.indexOf(j-1) && listInteger.indexOf(j-1) > indexI) {
					firstList.add(temp[j-1]);
					finalList.add(firstList);
				}
				
				else if(indexJ < listInteger.indexOf(j-1) && indexJ < indexI) {
					List<Integer> nextList= new ArrayList<>(firstList);
					nextList.remove(listInteger.indexOf(j-1));
					nextList.add(temp[j]);
					finalList.add(nextList);
				}				

			}					

		}

		System.out.println(finalList);

	}

}
