package strings;

public class Bulbs {

	public static void main(String[] args) {

		int[] A= {0, 1, 0, 1};
		System.out.println(sample(A));

	}

	private static int sample(int[] A) {

		int switchOn=0;
		boolean flag=false;

		for(int i=0; i< A.length; i++) {
			if(A[i] == 0 && !flag) {
				switchOn++;
				flag= true;
			}
			else if(A[i] == 1 && !flag) {
				continue;
			}
			else if(A[0] ==0 && i %2 ==0 && A[i] == 0 && flag) {
				switchOn++;
			}
			else if(A[0] ==0 && i %2 !=0 && A[i] == 0 && flag) {
				continue;
			}	
			else if(A[0] ==1 && i %2 ==0 && A[i] == 0 && flag) {
				continue;
			}
			else if(A[0] ==1 && i %2 !=0 && A[i] == 0 && flag) {
				switchOn++;
			}
			
			else if(A[0] ==0 && i %2 ==0 && A[i] == 1 && flag) {
				continue;
			}
			else if(A[0] ==0 && i %2 !=0 && A[i] == 1 && flag) {
				continue;
			}	
			else if(A[0] ==1 && i %2 ==0 && A[i] == 1 && flag) {
				continue;
			}
			else if(A[0] ==1 && i %2 !=0 && A[i] == 1 && flag) {
				switchOn++;
			}

		}
		return switchOn;
	}

}
