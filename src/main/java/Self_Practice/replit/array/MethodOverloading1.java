package replit.array;

import java.util.*;

public class MethodOverloading1 {

	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in).useLocale(Locale.US);
	    double i1 = in.nextDouble();
		System.out.println(i1);
		 boolean runInt = false;

		    if(runInt) {
		    	int [] arr = {4, 1, 2,3,4};
		    	System.out.println(findMax(arr));
		    } else {
		    	double [] arr = {41, 15, 2,31,45};
		    	for(int i=0; i < arr.length; i++) {
		    	      arr[i] = in.nextDouble();
		    	      }
		    	System.out.println(findMax(arr));
		    }
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for (int i =1; i<arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
				
			}
		}
		
		return max;
	}
	
	public static double findMax(double[] arr) {
		double max = arr[0];
		
		for (double d : arr) {
			if (max < d) {
				max = d;
			}
		}
		return max;
	}
}
