package labs.Lab4;

public class Q18 {

	public static void main(String[] args) {

		int[] x = {1,2,2,1}; // = > 6
		int[] y = {1,1}; // = > 2
		int[] a = {1,2,2,1,13}; // = > 6
		int[] b = {1,2,2,13,3,2,13,1,13,3}; // = > 6
		
		System.out.println(sum13(x));
		System.out.println(sum13(y));
		System.out.println(sum13(a));
		System.out.println(sum13(b));
		
	}

	public static int sum13(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 13) {
					sum += arr[i];
			} else {
				break;
			}
			
		}
		
		return sum;
	}
	
	
}
