package a_live_review.week09_31_07_2021;

public class StringPractice2 {

	public static void main(String[] args) {

		String str = "CYBERTEK"; // immutable
		
		str = str.toLowerCase(); // "cybertek" {new object}
		
		System.out.println(str); // "cybertek"

		String str2 ="Python Programing";
		str2 = null;
		System.out.println(str2); // null
	//	str2 = str2.toLowerCase();
	//	System.out.println(str2.toLowerCase());
		
		
		
	}

}
