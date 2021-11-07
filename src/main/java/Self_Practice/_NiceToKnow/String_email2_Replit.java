package _NiceToKnow;

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
public class String_email2_Replit {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   String email = scan.next();
		    String temp1 ="", temp2="",temp3="";
		    int i = 0, j=0;
	//	String    email = "mikaa_tyson@gmail.com";
		    String str=email.substring(0,1);
		    if (email.contains("_")){
			     while (!str.equals("_")){
				    	str = email.substring(i,i+1);
				    	i++;
			    	  }
			     temp1 = email.substring(0,i-1);
			    j=i;
			     while (!str.equals("@")){
			    	 	str = email.substring(j,j+1);
			    	 	j++;
			    	  }
			     temp2 = email.substring(i,j-1);
			     int k =j;
			     while (!str.equals(".")){
			    	 	str = email.substring(k,k+1);
			    	 	k++;
			    	  }
			     temp3 = email.substring(j,k-1);
			     
			     temp1 = temp1.substring(0,1).toUpperCase()+temp1.substring(1,temp1.length());
			     System.out.println("First name: "+ temp1);
			     
			     temp2 = temp2.substring(0,1).toUpperCase()+temp2.substring(1,temp2.length());
			     System.out.println("Last name: "+ temp2);
			     
			  //   temp3 = temp3.substring(0,1).toUpperCase()+temp3.substring(1,temp3.length());
			     System.out.println("Domain: "+ temp3);
			     
		    } else {
		      System.out.println(email);
		    }
		    
	    
	    
	}

}
