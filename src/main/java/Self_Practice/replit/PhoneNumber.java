package replit;

import java.util.*;


public class PhoneNumber {
	public static void main(String[] args) {
		int areaCode, localNumber;
		
		 Scanner sc = new Scanner(System.in);
		    areaCode   = sc.nextInt();
		    localNumber = sc.nextInt();

		 String phoneNumber;
		 
		 phoneNumber = "Calling number (" + areaCode +")-" +localNumber;
		 System.out.println(phoneNumber);
	}

}
