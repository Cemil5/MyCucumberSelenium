package replit;

import java.util.Scanner;
/*
 Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase. 
Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
 */
public class email2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   String email = scan.next();
		   int i = email.indexOf("_");
			int j = email.indexOf("@");
			    
			String first = email.substring(0, i);
			String last = email.substring(i+1,j);
			String domain = email.substring(j+1, email.indexOf("."));
			
			first = first.substring(0,1).toUpperCase()+first.substring(1); 
			last = last.substring(0,1).toUpperCase()+last.substring(1); 

			System.out.println("First name: "+ first);
			System.out.println("Last name: "+ last);
			System.out.println("Domain: "+ domain);
		   
	}

}