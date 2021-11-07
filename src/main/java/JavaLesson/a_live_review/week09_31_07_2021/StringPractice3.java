package a_live_review.week09_31_07_2021;

public class StringPractice3 {

	public static void main(String[] args) {
		
		String str = "Cybertek";
		
		char thirdChar = str.charAt(2); // b
		char lastChar = str.charAt(str.length()-1); // k
		
		System.out.println("------------------");
		
		String firstName = "Aaron";
		String lastName = "King";
		String initial = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
		System.out.println(initial);
		
		System.out.println("------------------");

		String s1 = "Cybertek@gmail.comSchool@yahoo.com";
		boolean isGmail = s1.endsWith("@gmail.com");
		System.out.println(isGmail);
		
		System.out.println("------------------");

		String email = "John.Daniel@yahoo.com";
		String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf("."));
		System.out.println(domain); // yahoo
		
		
		
	}

}
