package replit;

import java.util.Scanner;

public class SchooldGrader {

	public static void main(String[] args) {

		String s1, s2, s3, s4, s5;
		double d1, d2, d3, d4, d5, av;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the Grader!");
		System.out.println("Please enter subject name number 1 and score for this subject");
		s1 = s.next();
		d1 = s.nextDouble();
		System.out.println("Please enter subject name number 2 and score for this subject");
		s2 = s.next();
		d2 = s.nextDouble();
		System.out.println("Please enter subject name number 3 and score for this subject");
		s3 = s.next();
		d3 = s.nextDouble();
		System.out.println("Please enter subject name number 4 and score for this subject");
		s4 = s.next();
		d4 = s.nextDouble();
		System.out.println("Please enter subject name number 5 and score for this subject");
		s5 = s.next();
		d5 = s.nextDouble();
		
		System.out.println("Summary: " + s1 + " - " + d1 + ", "+ s2 + " - " + d2 + ", "+ s3 + " - " + d3 + ", "+ s4 + " - " + d4 + ", "+ s5 + " - " + d5);
		System.out.println("Your average score is: " + ((d1+d2+d3+d4+d5)/5));
		System.out.println("Thank you for using Grader!\nGoodbye!");
		
	}

}
