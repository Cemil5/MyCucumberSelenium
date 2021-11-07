package day27_Array_Cont;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		double[] d1 = {1.2, 3.4, 4.5};
		double[] d2 = d1;  // not copying just reference matching
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));	// [1.2, 3.4, 4.5]
		
		d3[0] = 0;
		System.out.println(Arrays.toString(d3));	// [0.0, 3.4, 4.5]
		
		double[] d4 = Arrays.copyOf(d2, 5);
		System.out.println(Arrays.toString(d4));	// [1.2, 3.4, 4.5, 0.0, 0.0]

		
		
		
		
		int[] numX = {4,6,7,10,55}; 
		System.out.println(Arrays.binarySearch(numX,7));  //2
		System.out.println(Arrays.binarySearch(numX,55));  //4
		System.out.println(Arrays.binarySearch(numX,9));  //-4  (-(insertionPoint)-1)

		
	}

}
