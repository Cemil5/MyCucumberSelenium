package _interviewPreparation;

import java.util.Arrays;
// Write a method that accepts 2 arrays and prints a new array containing all their elements
public class CombiningArrays_Lab4_Q14 {

	public static void main(String[] args) {

		int[] x1 = {1,2}; int[] y1 = {3,4};// = > [1,2,3,4]
		int[] x2 = {4,4,5}; int[] y2 = {2,2}; //= > [4,4,2,2]
		int[] x3 = {9,2}; int[] y3 = {3,4}; //= > [9,2,3,4]
		
	
		System.out.println(Arrays.toString(allElements(x1, y1)));
		System.out.println(Arrays.toString(allElements(x2, y2)));
		System.out.println(Arrays.toString(allElements(x3, y3)));
		
	}

	public static int[] allElements(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[i+arr1.length] = arr2[i];
		}
		return newArr;
	}
	
}
