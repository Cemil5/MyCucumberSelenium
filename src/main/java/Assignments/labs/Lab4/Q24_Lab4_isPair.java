package labs.Lab4;

public class Q24_Lab4_isPair {
	/*
	A value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
	Write a method that accepts an array and a number, and prints true if the given number is everywhere in the array. */

	public static void main(String[] args) {
		
		int[] x = {1, 2, 1, 3};
		int a = 2;  //Output: false
		
		
		int[] y = {1, 2, 1, 3};
		int b = 1; // Output: true
		
		System.out.println(isPair(x, a));
		System.out.println(isPair(y, b));

		
		System.out.println(ozzy(x, a));
		System.out.println(ozzy(y, b));
	}
	
	public static boolean isPair(int [] arr, int a) {
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i+=2) {
			if (arr[i] == a || arr[i+1] == a) {
				flag =  true;
			} else {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static boolean ozzy(int[] arr, int number) {
		
		for (int i = 0; i < arr.length-2; i++) {
			
			if ((arr[i] == number) && (arr[i+1] == number || arr[i+2] == number)) {
				return  true;
			}
		}
		
		return false;
	}
	
}
