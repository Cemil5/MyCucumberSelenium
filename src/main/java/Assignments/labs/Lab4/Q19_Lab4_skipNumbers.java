package labs.Lab4;

public class Q19_Lab4_skipNumbers {
	/*
Write a method that accepts an array and prints the total of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
	 */
	public static void main(String[] args) {

		int[] x = {1,2,2}; // = > 5
		int[] y = {1, 2, 2, 6, 99, 99, 7}; // = > 5
		int[] a = {1,1,6,7,2}; // = > 4
		int[] b = {1,1,6,2}; // = > 2
		int[] c = {1,2,2,6,99,99,7,3,4}; // = > 12
		
		System.out.println(sumExcept6(x));
		System.out.println(sumExcept6(y));
		System.out.println(sumExcept6(a));
		System.out.println(sumExcept6(b));
		System.out.println(sumExcept6(c));
		
		System.out.println(ozzy(x));
		System.out.println(ozzy(y));
		System.out.println(ozzy(a));
		System.out.println(ozzy(b));
		System.out.println(ozzy(c));
	}

	public static int sumExcept6 (int[] arr) {
		int sum =0;
		boolean b = true;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 6 && b) {
				sum += arr[i];
			} else {
				b = false;
				if (arr[i] ==7) {
					b = true;
				}
			}
		}
		
		return sum;
	}
	
	public static int ozzy(int[] arr) {
		int sum =0;
		boolean b = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (b) {
				if (arr[i] == 7){
					b = false;
				}
			} else if (arr[i] == 6) {
				b = true;
			} else {
				sum += arr[i];
			}
		}
		
		return sum;
	}
}
