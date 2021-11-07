package codeWars;

import java.util.Arrays;

public class HighMin {

	public static void main(String[] args) {
		
		System.out.println(highAndLow("1 2 3 4 5"));  // return "5 1"
		System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
		System.out.println(highAndLow("1 9 3 4 -5")); // return "9 -5"
		
	}
	
	public static String highAndLow(String numbers) {
	    // Code here or
		
	    String[] arr = numbers.split(" ");
	    int[] num = new int[arr.length];
	    String result = "";
	    
	    for (int i=0; i<arr.length;i++) {
	    	num[i] = Integer.parseInt(arr[i]);
	    }
	    Arrays.sort(num);
	    result = num[num.length-1] + " " + num[0];
	    
	    return result;
	  }
	
	public static String HighAndLowKata(String numbers) {
	     int max = Integer.MIN_VALUE;
	     int min = Integer.MAX_VALUE;
	     String nums[] = numbers.split(" ");
	     
	     for(String s: nums) {
	       int num = Integer.parseInt(s);
	       
	       max = Math.max(max, num);
	       min = Math.min(min, num);
	     }  
	     
	     return "" + max + " " + min;
	  }
}
