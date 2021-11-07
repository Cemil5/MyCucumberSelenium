package day25_ArrayCont;

import java.util.Arrays;

public class Task92_Numbers {

	public static void main(String[] args) {
		
		int[] num1 = new int[10];
		
		for (int i=0; i<num1.length;i++) {
			num1[i] =i+1;
		}
		for (int i=0; i<num1.length;i++) {
			num1[i] *= 19;
			System.out.println(num1[i]);
		}
		System.out.println(Arrays.toString(num1));
	}

}
