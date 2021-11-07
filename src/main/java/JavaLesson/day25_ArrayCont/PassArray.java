package day25_ArrayCont;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		
		numbers[0] = 1;
		
		getValues1(numbers);
		
		System.out.println("here are the numbers");
		
		showArray(numbers);
		
		System.out.println();
		for (int v : numbers) {
			System.out.print(v + " ");
		}
	}

	public static void getValues(int[] array) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a series of " + array.length + " numbers");
		
		for (int i=0; i<array.length; i++) {
			System.out.println("enter number " + (i+1) + " :");
			array[i] = sc.nextInt();
		}
		
	}
	
public static void getValues1(int[] array) {
	//int[] array = new int[4];
				
		for (int i=0; i<array.length; i++) {
			array[i] = i*10;
		}
		
	}
	
	public static void showArray(int[] a) {
		for (int value : a) {
			System.out.print(value + " ");
		}
		for (int i=0;i<a.length;i++) {
			a[i] = i;
		}
	}
	
	
}
