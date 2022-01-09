package strings;

import java.util.ArrayList;
import java.util.List;

public class SeatingArrangement {

	public static void main(String[] args) {

		System.out.println(sample(".x.x.x..x"));

	}

	private static int sample(String A) {

		char[] arr= A.toCharArray();
		int lastIndex=arr.length -1;
		int firstIndex=0;
		List<Integer> list= new ArrayList<>();

		if(! A.contains(".")) {
			return 0;
		}

		else if(! A.contains("x")) {
			return 0;
		}

		for(int i=0; i <arr.length; i++) {
			if(arr[i] == 'x') {
				list.add(i);
			}
		}
		for(int k= 0 ; k <arr.length; k++) {
			if(arr[k] == 'x') {
				firstIndex=k; 
				break;
			}
		}

		for(int j= arr.length -1 ; j>=0; j--) {
			if(arr[j] == 'x') {
				lastIndex=j;
				break; 
			}
		}

		long count=list.stream().reduce(0, (a,b) -> a+b);
		int median= (int) (count/list.size());

		int midhops=0;
		int multiplier =1;
		
		//x.x.xx.x.xxx..... place ..x..x.xxx..x.xxx

		for(int i=firstIndex + 1; i <= median; i++) {
			if(arr[i] == '.') {
				midhops= midhops + multiplier;
				continue;
			}
			else if(arr[i] == 'x') {
				multiplier++;
				continue;
			}

		}
		multiplier =1;

		for(int i=lastIndex - 1; i > median; i--) {
			if(arr[i] == '.') {
				midhops= midhops + multiplier;
				continue;
			}
			else if(arr[i] == 'x') {
				multiplier++;
				continue;
			}

		}
		return midhops % 10000003 ;
	}

}
