package replit.array;

import java.util.Arrays;

public class ReverseLetters {
	/*
Create a method **reverseNoSpec(String)** that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
	 */

	public static void main(String[] args) {
		
		String str1 = "Ab,c,de!$";  // Output:  str = "ed,c,bA!$"
		
		String str2 = "----qwe--r--tyf...gd.---"; // Output:  str = "----dgf--y--tre...wq.---" 
		
		System.out.println(reverseNoSpec(str1).equals("ed,c,bA!$"));
		System.out.println(reverseNoSpec(str2).equals("----dgf--y--tre...wq.---"));

		
	}
	public static String reverseNoSpec(String str) {
		String reversed = "";
		String rev = "";
		String temp = "";

		String [] s = new String[str.length()];
		
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			
			if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c<= 'z')) {
				s[i]=""+c;
				temp += ""+c;
			}
		}
		
		for (int i=temp.length()-1; i>=0;i--) {
			rev += temp.charAt(i);
		}
		
		int k=0;
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c<= 'z')) {
				reversed += ""+rev.charAt(k);
				k++;
			} else {
				reversed += ""+c;
			}
		}
		
		//System.out.println(Arrays.toString(s));
		return reversed;
	}
}
