package day14_Methods;
/*
 * You are driving a little too fast, and a police officer stops you. Write a method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
 */
public class Lab5_driving {

	public static void main(String[] args) {
		
		int speed = 59;
		boolean birthday = false;
		driving(speed, birthday);
	}
	
	public static void driving (int speed, boolean isBirthday) {
		
		if (!isBirthday) {
			if (speed<=60 && speed >=0) {
				System.out.println(0);
			} else if (speed<=80) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		} else {
			if (speed<=65 && speed >=0) {
				System.out.println(0);
			} else if (speed<=85) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}
}
