package a_live_review.week08_24_07_2021;

import java.util.Scanner;

public class NextVSNextLine {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = obj.next();
		
		System.out.println("Enter your last name");
		String lastName = obj.next();
		
		System.out.println("Enter your age");
		byte age = obj.nextByte();
		
		obj.nextLine();
		System.out.println("Enter your address");
		String address = obj.nextLine();
		
		System.out.println("Enter your phone number");
		String phone = obj.nextLine();
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(address);
	}

}
