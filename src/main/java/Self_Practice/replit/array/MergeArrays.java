package replit.array;

import java.util.Arrays;

public class MergeArrays {
	
	public static int[] mergR(int[] a,int[] b) {
	    
		int[] merge = new int[a.length+b.length];
		
		for (int i=0;i<a.length;i++) {
			merge[i] = a[i];
		}
		for (int i=a.length;i<a.length+b.length;i++) {
			merge[i] = b[i-a.length];
		}
		
		return merge;
	  }//end mergR

	public static void main(String[] args) {

	  int [] nums = {1,2,3};
	  int [] nums2 = {4,5,6};
		
	
	  System.out.println(Arrays.toString(mergR(nums, nums2)));
	}

}
