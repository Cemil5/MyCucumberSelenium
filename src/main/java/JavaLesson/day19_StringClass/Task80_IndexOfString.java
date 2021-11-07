package day19_StringClass;

import java.util.Scanner;

public class Task80_IndexOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	String str1 = sc.nextLine();
	//	String str2 = sc.nextLine();
		
		String str1, str2;
		str1 ="Your order confirmation number is XYZ";
		str2 = "confirmation";
		
		index(str1, str2);

	}

	public static void index(String s1, String s2) {
		if (s1.contains(s2)) {
			System.out.println(s1.indexOf(s2));
		} else {
			System.out.println("not found");
		}
	}
}
