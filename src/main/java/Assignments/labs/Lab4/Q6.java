package labs.Lab4;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

		int[] x = {1,2,3}; //= > [3,3,3]
		int[] y = {11,5,9}; //= > [11,11,11]
		int[] a = {110,5,98,0,1200,11,-4}; //= > [1200,1200,1200,1200,1200,1200,1200]
		
		max(x);
		max(y);
		max(a);
	}

	public static void max(int[] num) {
		
		int max = num[0];
		
		for (int i =1; i<num.length;i++) {	
			if (max < num[i]) {
				max = num[i];
			}
		//	max = Math.max(num[i], max);
		}
		
		for (int i =0; i<num.length;i++) {
			num[i] = max;
		}
		
		System.out.println(Arrays.toString(num));
	}
	
}
