package a_live_review.week09_31_07_2021;

public class StringPractice4 {

	public static void main(String[] args) {
		
		String first = "cyBERtek";
		String last = "SCHOOL";		// fullname = Cybertek School
		
		first = first.toLowerCase();
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
		
		System.out.println(first + " " + last);
		
	}

}
