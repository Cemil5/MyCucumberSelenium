package labs.Lab4;

public class Q12 {

	public static void main(String[] args) {

		int[] x = {1,2,3,1};
		int[] y = {1,3};
	//	Output = 2
		System.out.println(count1(x,y));
	}

	public static int count1(int[] arr1, int[] arr2) {
		int count =0;
		
		if (arr1[0] == 1) {
			count ++;
		}
		if (arr2[0] == 1) {
			count ++;
		}
		
		return count;
	}
	
	
}
