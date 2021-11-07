package _NiceToKnow;

public class PasswordValidation_Muhtar {
	
	/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. Password should at least contain one letter 
                3. Password should at least contain one special characters
                4. Password should at least contain a digit
	 */

	public static void main(String[] args) {
		String password = "mnjæa kl12";
		String letters = "";	 // mnjklABCD
		String digits = "";	 //  12345
		String specialChars = ""; 
		
		if (password.length()<8 || password.contains(" ")) {
			System.out.println("password must be at least 8 characters and should not contain space characters");
			System.exit(0);
		}
		
		for (int i=0; i<= password.length()-1; i++) {
			char ch = password.charAt(i);
			if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
				letters += ch;
			} else if (ch >= '0' && ch <= '9'){
				digits +=ch;
			} else {
				specialChars += ch;
			}
		}
		
		// ******************************
		boolean r1 = password.length()>=8 & !password.contains(" ");
		boolean r2 = !letters.isEmpty();
		boolean r3 = !digits.isEmpty();
		boolean r4 = !specialChars.isEmpty();
		boolean isPasswordStrong = r1 && r2 && r3 && r4;
		if (isPasswordStrong) {
			System.out.println("password is strong");
		} else {
			System.out.println("password is weak");
		}
		
		// ******************************
		
		if (letters.isEmpty() || digits.isEmpty() || specialChars.isEmpty()) {
			System.err.println("password must contain at least one letter, one special characters and one digit.");
		} else if (specialChars.contains(" ")) {
			System.err.println("password can not contain space");
		} else {
			System.err.println("valid password");
		}

	}

}
