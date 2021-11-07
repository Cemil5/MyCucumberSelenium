package replit.array;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(populate(5)));;
		
		int [] i= new int[new Scanner(System.in).nextInt()]; 
	    i = populate(i) ;
	    System.out.println(Arrays.toString(i));
		
	}
	public static int[] populate(int[] r) {
		
		for (int i = 0; i < r.length; i++) {
			r[i] = i+1;
		}
		return r;
	}
	
	public static int[] populate(int r) {
		int[] arr = new int[r]; 
		
		for (int i = 0; i < r; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
}
