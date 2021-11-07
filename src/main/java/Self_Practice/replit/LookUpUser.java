package replit;

import java.util.Scanner;

public class LookUpUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		 
		 System.out.println("Enter full name:");
		 String name = scan.nextLine();
		 
		 name = name.toLowerCase();
		 String name1 = "max payne";
		 String name2 = "alan wake";
		 
		 if (name.equals(name1) ||name.equals(name2) ) {
			 System.out.println("User found!");
		 } else {
			 System.out.println("User not found!");
		 }
		 
	}

}
