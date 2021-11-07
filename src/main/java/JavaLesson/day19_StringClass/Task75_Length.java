package day19_StringClass;

import java.util.Scanner;

public class Task75_Length {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your first name");
		String firstName = sc.next();
		
		System.out.println("enter your last name");
		String lastName = sc.next();
		
		System.out.println(firstName.length());
		System.out.println(lastName.length());

	}

}
