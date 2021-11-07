package a_live_review.week09_31_07_2021;

public class StringPractice1 {

	public static void main(String[] args) {


		String str1 = "Cybertek";
		String str2 = "Cybertek"; // str1 & str2 in string pool : same object

		String str3 = new String ("Cybertek"); // heap: "Cybertek"
		String str4 = new String ("Cybertek"); // heap: "Cybertek"
		
		String str5 = "cybertek"; // string pool : "cybertek" : different object
		String str6 = new String("cybertek"); // heap : "cybertek"

		System.out.println(str1 == str2); // true
		
		System.out.println(str3 == str1); // false
		System.out.println(str3 == str4); // false
		System.out.println(str5 == str6); // false
		
		System.out.println("--------------------------");
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.compareToIgnoreCase(str2)); // 0
		System.out.println("cyber".compareToIgnoreCase(str2)); // -3
		System.out.println("cyberteks".compareToIgnoreCase(str2)); // 1

		System.out.println(str5.equalsIgnoreCase(str2)); // true


		System.out.println("--------------------------");
		String s1 = "JAVA";
		String s2 = "java";
		
		System.out.println(s1 == s2); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true

		
		
	}

}
