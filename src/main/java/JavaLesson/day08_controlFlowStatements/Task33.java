package day08_controlFlowStatements;

public class Task33 {
	public static void main(String[] args) {
		int marks = 101;
		
		if (marks < 60 ) {
			System.out.println("Fail");
		} else if (marks >= 60 && marks < 90) {
			System.out.println("Pass");
		} else if (marks >= 90  && marks <= 100) {
			System.out.println("Passed with Distinction");
		} else {
			System.out.println("Invalid Score");
		}
	}

}
