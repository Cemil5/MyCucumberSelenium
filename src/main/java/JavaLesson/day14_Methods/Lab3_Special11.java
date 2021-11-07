package day14_Methods;

public class Lab3_Special11 {
/*
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Write a method that accepts a number and prints true if the given number is special.
specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
 */
	public static void main(String[] args) {

		special(121);
		special(22);
		special(23);
		special(24);

	}
	public static void special(int num) {
		if (num % 11 == 0 || num % 11 ==1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
