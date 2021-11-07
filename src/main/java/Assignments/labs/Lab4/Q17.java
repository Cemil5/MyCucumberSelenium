package labs.Lab4;

public class Q17 {

	public static void main(String[] args) {
		
		int[] x = {10,3,5,6};// = > 7
		int[] y = {7,2,10,9};// = > 8
		int[] z = {2,10,7,2};// = > 8
		
		System.out.println(difference(x));
		System.out.println(difference(y));
		System.out.println(difference(z));
	}
	
	public static int difference(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int num : arr) {
			if (num>max) {
				max = num;
			} else if (num<min) {
				min = num;
			}
		}
		
		return max-min;
	}
	
}
