package day20_StringClass;

import java.util.Scanner;

public class Task82_LoginFunctionality {
/*
 * • Login Functionality Logic
• UserName,Password
• --- > Program will ask to enter username and password
• --- > If both username and password are blank
• "UserName and Password Fields cannot be empty"
• --- > If userName is blank and password is not blank
• "UserName cannot be empty"
• --- > If userName is not blank and password is blank
• "Password cannot be empty"
• --- > If the username or password is not valid
• "UserName or password is not valid. Please verify"
• --- > If the username and password are both valid
• "User Logged in successfully"
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username and password");
		String inputUsername = sc.nextLine();
		String inputPassword = sc.nextLine();
		String msg ="";
		String username = "cybertek";
		String password = "EU6";
				
		if (inputUsername.length()==0 && inputPassword.length()==0) {
			msg= "UserName and Password Fields cannot be empty";
		} else if (inputUsername.length()==0) {
			msg= "UserName cannot be empty";
		} else if (inputPassword.length()==0) { 
			msg= "Password cannot be empty";
		} else if (inputUsername.equals(username) && inputPassword.equals(password)) {
			msg= "User Logged in successfully";
		} else {
			msg= "UserName or password is not valid. Please verify";
		}
		System.out.println(msg);
	}

}
