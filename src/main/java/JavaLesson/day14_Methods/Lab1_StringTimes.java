package day14_Methods;

public class Lab1_StringTimes {
/*
 * Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi
 */
	public static void main(String[] args) {
		
		stringTimes("Hi", 5);
	}
	public static void stringTimes(String st, int num) {
		String str ="";
		for (int i=1; i<=num; i++) {
			str = str + st;
		}
		System.out.println(str);

	}
	
}
