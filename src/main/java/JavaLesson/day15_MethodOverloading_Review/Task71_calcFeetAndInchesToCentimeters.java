package day15_MethodOverloading_Review;

public class Task71_calcFeetAndInchesToCentimeters {
/*
 * But if it is valid, then calculate how many feet are in the inches.
ØCall the other overloaded method passing the correct feet and inches calculated so that it
can calculate correctly.
ØHints : Use double for your number datatypes
1 inch = 2.54cm and 1 ft =12 inches
 */
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double feet =0, result=0;
		double remainingInches =0;
		if (inches >=0) {
			feet = (int)inches / 12;
			remainingInches = inches % 12;
			System.out.println(inches + " inches="+ feet + " feet and " + remainingInches + " inches");
			
		} else {
			return -1;
		}
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double result =0;
		if (feet >=0 && (inches >=0 && inches <=12)) {
			result = (feet*12)*2.54;
			System.out.println("result = " + result + " centimeters");
		} else {
			System.out.println("Invalid feet or inches");
			result = -1;
		}
		return result;
	}
	
	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);
		
	}

}
