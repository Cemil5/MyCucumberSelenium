package replit.array;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {

	public static void main(String[] args) {
		
		String email = "info@cybertekschool.com";
		splitMail(email);
		email = "hello-gmail.com";
		splitMail(email);

		email = "my@fancy@email.com";
		splitMail(email);

	}

	private static void splitMail(String email) {
		
		String[] arr = email.split("@");
		if (arr.length ==2) {

		//	String[] arr1 = arr[1].split("\\.");
		//	System.out.println(Arrays.toString(arr1));


			System.out.println("Email id: " + arr[0]);
			System.out.println("Email domain: " + arr[1]);
		} else {
			System.out.println("invalid email");
		}
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter first number:");
		    int n1 = sc.nextInt();
		    System.out.println("enter second number:");
		    int n2 = sc.nextInt();
		    System.out.println(n1 + n2);
		    
		    
	
	
	
	}
	
	
	
}
