package replit;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     plus();
	  }
	  
	  // Do not touch above

	  public static void plus(){
	     
	    //your code here
		  Scanner s = new Scanner(System.in);
		  System.out.println("enter first number:");
		  int num1 = s.nextInt();
		  System.out.println("enter second number:");
		  int num2 = s.nextInt();
		  System.out.println("result: " + (num1+num2));
	    
	    
	  }

}
