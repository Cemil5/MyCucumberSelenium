package replit;

import java.util.Scanner;
/*
 Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email. Examples:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class email_Replit {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   String email = scan.next();
		    String temp1 ="", temp2="";
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
			    	 	if (j>1) {
			    	 		str = email.substring(j,j+1);
			    	 	}
			    	 	j++;
			    	  }
			     temp2 = email.substring(i,j-1);
			     email=temp2+"_"+temp1+email.substring(j-1, email.length());
			     System.out.println(email);
		    } else {
		      System.out.println(email);
		    }
		    
	    
	    
	}

}
