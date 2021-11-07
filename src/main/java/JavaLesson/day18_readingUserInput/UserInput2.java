package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a sentence and I will repeat it:");
		
	//	String str = sc.next();	// boþluktan sonrasýný almaz.
	//	System.out.println(str);
		
		String str2 = sc.nextLine(); // enter'a basana kadar hepsini alýr.
		
		System.out.println(str2);
	}

}
