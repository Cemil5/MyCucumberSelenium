package replit.array;

import java.util.Arrays;

public class SwitchElements {

	public static void main(String[] args) {

		 // do_switch([1,2,3,4]) returns:[4,2,3,1]
		int[] arr = {7,2,3,5};
		System.out.println(Arrays.toString(do_switch(arr)));
		
	}
	 public static int[] do_switch(int[] i) {
		 
		 int temp = 0;
		 temp = i[0];
		 i[0] = i[i.length-1];
		 i[i.length-1] = temp;

		 return i;
	 }
}
