package day08_controlFlowStatements;

public class Task34 {
	public static void main(String[] args) {
		
		int sub1 = 90;
		int sub2 = 90;
		int sub3 = 90;
		double average;
		
		average = (sub1 + sub2 + sub3) / 3 ;
		System.out.println("Average is " + average);
		
		if (average<=100 && average >= 90) {
			System.out.println("Your grade is A");
		} else if (average<=89 && average >= 80) {
			System.out.println("Your grade is B");
		} else if (average<=79 && average >= 70) {
			System.out.println("Your grade is C");
		} else if (average<=69 && average >= 60) {
			System.out.println("Your grade is D");
		} else if (average<=59 && average >= 0) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("not a valid average");
		}
			
			
	}

}
