package day26_arrays_part3;

import java.util.Arrays;

public class Task94_PasswordCreation {

	public static void main(String[] args) {

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		System.out.println(useSplit(info1,info2));

		System.out.println(useSubstring(info1,info2));
		
	}
	
	public static String useSplit(String info1, String info2) {
		String output = ""; 
		String[] array1 = info1.split("password :");
		String[] array2 = info2.split("password :");
		
		System.out.println(Arrays.toString(array1));
		
		String pass1 = array1[1].split(". Please")[0]; // [0] takes just first part of the array.
		System.out.println(pass1);
		
		String pass2 = array2[1].split(". Please")[0];

		pass1 = pass1.substring(4,10);
		pass2 = pass2.substring(4,10);
		
		output = pass1.trim()+pass2.trim();
		
		return output;
	}
	
	
	
	public static String useSubstring(String info1, String info2) {
String output = info1.substring(info1.indexOf("xxx")+3, info1.lastIndexOf("xxx"));
		
		output += info2.substring(info2.indexOf("xxx")+3, info2.lastIndexOf("xxx"));
		return output;
	}
}
