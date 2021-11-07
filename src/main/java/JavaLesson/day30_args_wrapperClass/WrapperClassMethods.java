package day30_args_wrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('a')); 	// true
		System.out.println(Character.isAlphabetic('1'));	// false
		System.out.println(Character.isAlphabetic(' '));
		
		System.out.println("isSpaceChar " + Character.isSpaceChar(' '));

		
		System.out.println(Character.isLetter('a'));	// true
		System.out.println(Character.isLetter('&'));	// false

		System.out.println(Character.isDigit('5'));	// true
		System.out.println(Character.isDigit('&'));	// false
	}

}
