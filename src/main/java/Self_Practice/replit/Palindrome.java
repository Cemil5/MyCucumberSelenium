package replit;
import java.util.Scanner;
/*
 * Complete the method **isPalindrome()** that will check if number is a palindrome. Print your result as a boolean (true or false). 
> Challenge: Do not convert int into a string!

Examples:
input: 1001
output: true

input: 1234
output: false
 */
public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	   if (num<1_000_000_000) {
		   isPalindrome(num);
	   } else {
		   System.out.println("please enter a number smaller than 1_000_000_000");
	   }
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
		  int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0, n=0;
		  
			
		  if (num>=100_000_000) {
			  d9 = num / 100_000_000;
			  num = num - d9*100_000_000;
			  if (n==0) {n=9;}
		  } 
		  if (num>=10_000_000) {
			  d8 = num / 10_000_000;
			  num = num - d8*10_000_000;
			  if (n==0) {n=8;}
		  } 
		  if (num>=1_000_000) {
			  d7 = num / 1_000_000;
			  num = num - d7*1_000_000;
			  if (n==0) {n=7;}
		  } 
		  if (num>=100_000) {
			  d6 = num / 100_000;
			  num = num - d6*100_000;
			  if (n==0) {n=6;}
		  } 
		  if (num>=10_000) {
			  d5 = num / 10_000;
			  num = num - d5*10_000;
			  if (n==0) {n=5;}
		  } 
		  if (num>=1_000) {
			  d4 = num / 1_000;
			  num = num - d4*1_000;
			  if (n==0) {n=4;}
		  } 
		  if (num>=100) {
			  d3 = num / 100;
			  num = num - d3*100;
			  if (n==0) {n=3;}
		  }  
		  if (num>=10) {
			  d2 = num / 10;
			  num = num - d2*10;
			  if (n==0) {n=2;}
		  } 
		  if (num>=0) {
			  d1 = num;
			  if (n==0) {n=1;}
		  } 
		  
		 // System.out.println(n);
		  if ((n==2 && d1==d2)||(n==3 && d1==d3)||(n==4 && d1==d4 && d2==d3)||(n==5 && d1==d5 && d2==d4)||(n==6 && d1==d6 && d2==d5 && d3==d4)||(n==7 && d1==d7 && d2==d6 && d3==d5)||(n==8 && d1==d8 && d2==d7 && d3==d6&& d4==d5)||(n==9 && d1==d9 && d2==d8 && d3==d7&& d4==d6)) {
			  System.out.println(true);
		  } else {
			  System.out.println(false);
		  }
		  
	    
		  
	    
	  }

}
