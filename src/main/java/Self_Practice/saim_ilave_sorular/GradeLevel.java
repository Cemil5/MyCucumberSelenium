package saim_ilave_sorular;

import java.util.Scanner;

/* Given a grade level (byte) determine and print which school level someone is in.
            1-5: Elementary school
            6-8: Middle school
            9-12: High school
            13-16: College
            17-18: Grad School
            Other: Invalid grade level given  */
public class GradeLevel {
	
	static String message = "";
	static byte gradeLevel;
	
	
	
	public static void test(byte lvl) {
		gradeLevel = lvl;
		if (gradeLevel>=1 && gradeLevel<=5) {
			message ="Elementary school";
		} else if (gradeLevel>=6 && gradeLevel<=8) {
			message ="Middle school";
		} else if (gradeLevel>=9 && gradeLevel<=12) {
				message ="High school";
		} else if (gradeLevel>=13 && gradeLevel<=16) {
					message ="College";
		} else if (gradeLevel>=17 && gradeLevel<=18) {
						message ="Grad School";	
		} else {
			message = "Invalid grade level given";
		}
		System.out.println(message);
	
	}
}
