package labs.Lab4;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		
		int[] x = {2,5}; //= > true
		int[] y = {4,3}; //= > true
		int[] z = {4,5}; //= > false
		
		System.out.println(contains23(x));
		System.out.println(contains23(y));
		System.out.println(contains23(z));
	}

	public static boolean contains23(int[] num) {
		
		Arrays.sort(num);
		
		if (Arrays.binarySearch(num, 2)>=0 || Arrays.binarySearch(num, 3)>=0) {
		//	System.out.println(Arrays.binarySearch(num, 2));
			return true;
		} else {
		//	System.out.println(Arrays.binarySearch(num, 2));
			return false;
		}
		
	}
	
}
