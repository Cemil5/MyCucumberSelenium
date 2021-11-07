package replit;
import java.util.*;
/*
 *  less than 2, ineligible
    2, toddler
    3-5, early childhood
    6-7, young reader
    8-10, elementary
    11 and 12, middle
    13, impossible
    14-16, high school
    17-18, scholar
    greater than 18, ineligible
 */

public class HappyValleySchoolChildren {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter age:");
	int age = input.nextInt();
	
	String message = "";
	
	if (age < 2) {
		message = "ineligible";
	} else if (age == 2) {
		message = "toddler";
	} else if  (age >= 3 && age <=5) {
		message = "early childhood";
	} else if  (age >= 6 && age <=7) {
		message = "young reader";
	} else if  (age >= 8 && age <=10) {
		message = "elementary";
	} else if  (age >= 11 && age <=12) {
		message = "middle";
	} else if  (age == 13) {
		message = "impossible";
	} else if  (age >= 14 && age <=16) {
		message = "high school";
	} else if  (age >= 17 && age <=18) {
		message = "scholar";
	} else if  (age >18) {
		message = "ineligible";
	}
	System.out.println(message);
	
	}

}
