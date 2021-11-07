package labs.Lab4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

		int[] x = {1,2,3}; //= > [2,3,1]		first element goes to the end.
		int[] y = {17,12,10,8}; //= > [12,10,8,17]
		int[] a = {7,0,0}; //= > [0,0,7]
				
		rotate(x);		
		rotate(y);		
		rotate(a);		
			
				
	}
	public static void rotate(int[] num) {
		
		int[] result = new int[num.length];
		
		int i=0;
		for (; i<num.length-1;i++) {
			result[i] = num[i+1];
		}
		result[i] = num[0];
		System.out.println(Arrays.toString(result));
	}
	
}
