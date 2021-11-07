package a_live_review.week11_14_08_2021;

import java.util.Iterator;

public class WrapperClassPractice {

	public static void main(String[] args) {
		
		int n1 =100;
		byte b1 = 90;
		
		Byte b2 = b1;
		Byte b3 = (byte)n1;	// casting or compilation error.
		Long l1 = (long)b1;	// casting or compilation error.
		System.out.println(l1);
		
		Long l2 = 1000l;
		double d1 = l2;
		Double d2 = (double)l2;
		Double d3 = d2;
		
		System.out.println("----------------------");
		
		int i1 = 100;
		Integer i2 = i1;	// autoBoxing : only accepts its primitive
		//Long i3 = i1;
		
		Integer n2 = 300;
		int n3 = n1;		// unBoxing : casting is automatic, we don't have to write casting syntax
		long n4 = n1;
		float n5 = n1;
		double n6 = n1;
		
		System.out.println("-----------Wrapper Class Methods----------------");
		
		String str1 = "123";
		System.out.println(str1 + 1); // 1231
		
		int num = Integer.parseInt(str1); // int = 123		primite = primite : no auto or unboxing : just assigning
		
		Integer num2 = Integer.valueOf(str1); // Integer ==> 123 wrapper = wrapper : no auto or unboxing : just assigning
		
		Integer num3 = Integer.parseInt(str1);	// auto-boxing
		int num4 = Integer.valueOf(str1);	// un-boxing
		
		System.out.println(num3 + 1);
		
		String str2 = "123abc";
		// System.out.println( Integer.parseInt(str2));
		
		String str3 = "   0.05   ";
		double a1 = Double.parseDouble(str3); // no boxing
		System.out.println(a1);
		
		str3 = "   0.05   ";
		Double a2 = Double.valueOf(str3);
		System.out.println(a2);
		
		System.out.println("-----------Character methods---------------");
		
		// Character: isDigit(), isLetter, isLowerCase(), isLetterOrDigit()
		char ch = 'ç';
		
		Character.isAlphabetic(num4);
		boolean isDigit = Character.isDigit(ch);
		boolean isLetter = Character.isLetter(ch);	// ignores upper or lowercase	
		boolean isLowerCaseLetter = Character.isLowerCase(ch);
		boolean isUpperCaseLetter = Character.isUpperCase(ch);

		// special char : !, @,   ,. ? ; : { [ ] } & %
		boolean isSpecialChar = ! Character.isLetterOrDigit(ch);	// if the character is not letter or not a digit, then it's a special character
		
		System.out.println(isDigit);
		System.out.println(isLetter);
		System.out.println(isLowerCaseLetter);
		System.out.println(isUpperCaseLetter);
		System.out.println(isSpecialChar);
		System.out.println(Character.isAlphabetic(ch));


		System.out.println("-----------------------------------------");

		String s1 = "a1b2c3";	// 
		int sumOfDigits =0;
		
		char[] arr = s1.toCharArray();
		
		for (char each : arr) {
			if (Character.isDigit(each)) {
				sumOfDigits += Integer.parseInt(""+ each);
				//sumOfDigits += Character.valueOf(each);    150
			}
		}
		System.out.println(sumOfDigits);
	
	
	System.out.println("-----------------------------------------");
	
	String s = "abcd123AAEAU COT4!@#  ¼efhgOTU  Üi6789k#¼¼¼$$$";
	String letters = "";
	String upperCaseLetters = "";
	String lowerCaseletters = "";
	String digits = "";
	String specialChars = "";
	
	for (char each : s.toCharArray()) {
		if (Character.isLetter(each)) {
			letters += each;
			if (Character.isLowerCase(each)) {
				lowerCaseletters += each;
			} else {
				upperCaseLetters += each;
			}
		} else if (Character.isDigit(each)) {
			digits += each;
		} else {
			specialChars += each;
		}
		
	}
	System.out.println(letters);
	System.out.println(upperCaseLetters);
	System.out.println(lowerCaseletters);
	System.out.println(digits);
	System.out.println(specialChars);

	System.out.println(Integer.parseInt(digits)*10);
	
	}
}
