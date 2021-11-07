package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many questions are on the final exam?");
		int questions = sc.nextInt();
		
		System.out.println("how many questions did the student miss=");
		int missed = sc.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		System.out.println("The grade for the exam is " + exam.getGrade());
		
		
	}

}
