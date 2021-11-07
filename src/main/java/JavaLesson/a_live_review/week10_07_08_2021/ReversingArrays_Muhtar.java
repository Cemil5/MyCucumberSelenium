package a_live_review.week10_07_08_2021;

import java.util.Arrays;

public class ReversingArrays_Muhtar {

	public static void main(String[] args) {

		String[] names = {"Selda", "Zeynep", "Selcuk", "Ali", "Niyazi"};
		
		Arrays.sort(names); // ascending using ASCII table
		
		String[] namesDesc = new String[names.length];
		
		/*
		for (int i=0; i<names.length;i++) {
			namesDesc[i] = names[names.length-1-i];
		}
  		*/
		
		for (int i=names.length-1, j=0; i>=0;i--, j++) {
			namesDesc[j] = names[i];
		}
		
		System.out.println(Arrays.toString( names ));
		System.out.println(Arrays.toString( namesDesc ));
		
		System.out.println("-----------------------------------");
		
		// sentence reverse 
		String str = "I love Java";
		
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		String reverse = "";
		String space = "";
		
		for (int i = words.length-1; i>=0;i--) {
			reverse += space + words[i];
			space = " ";
		}
		System.out.println(reverse); // java love I
		
		
		
	}

}
