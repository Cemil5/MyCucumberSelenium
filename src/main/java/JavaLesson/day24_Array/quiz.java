package day24_Array;

import java.util.Arrays;

public class quiz {

	public static void main(String[] args) {

	int [] num1 = new int [3];
	int [] arr = {10,2,3,14};
	char [] chs = {'D','C','A'};
	
	Arrays.sort(arr);
	for(int i : arr) {
		System.out.print(i + " ");
	}
	System.out.println("\n--------");
	String[] planets = {"mercurey", "venus"};
	
	System.out.println(planets[1].length());
	
	int i=0;
	
	do {
		System.out.println(arr[i]+"");
		i++;
	} while (i<arr.length-1);
	
	/*
	for (int i=0; i<num1.length;i++) {
		System.out.println(num1[i]);
	}
	*/		
		
	}

}
