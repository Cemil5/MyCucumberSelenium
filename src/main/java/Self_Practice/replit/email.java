package replit;

import java.util.Scanner;
/*
 Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email. Examples:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class email {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		//  String email = scan.next();
		    
		    String email = "mike_tyson@gmail.com";
		    int i = email.indexOf("_"); 
		    if (i>0) {
			    int j =email.indexOf("@");;
			    String str1 = email.substring(0,i);
			    String str2 = email.substring(i+1,j);
			   
				email=str2+"_"+str1+email.substring(j, email.length());
				System.out.println(email);
		    } else {
		    	System.out.println(email);
		    }
		    
	    
	    
	}

}
