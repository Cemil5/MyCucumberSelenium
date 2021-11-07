package replit.array;

import java.util.Arrays;
/*
 *Finish the getWithE. Given a String array arr with the following elements
["zero", "one", "two","three","four"]
Create another array fewValues and copy words that have letter e in them
You need to know how many element contain e and create array accordingly
Values in fewValues array need to be ["zero", "one","three"]
 arr -> ["aa", "be", "lol", "lel", "oreo"] 
fewValues -> ["be",  "lel", "oreo"] 
arr -> ["e", "hey", "bye", "fury", "spoon"] 
fewValues ->["e", "hey", "bye"] 
 */

public class CopyingCertainValues {

	public static void main(String[] args) {
		
	//	String[] arr = {"zero", "one", "two","three","four"};
		String[] arr = {"aa", "be", "lol", "lel", "oreo"};
		
		System.out.println(Arrays.toString(getWithE(arr)));

	}

	public static String[] getWithE(String[] arr) {
		
		String[] temp = new String[arr.length];
		int j =0;
		
		for (int i=0; i<arr.length;i++) {
			if (arr[i].contains("e")) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		String[] fewValues = new String[j];
		for (int i =0; i<j;i++) {
			fewValues[i] = temp [i];
		}
		
		
		return fewValues;
	}
}
