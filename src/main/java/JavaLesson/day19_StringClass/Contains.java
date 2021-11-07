package day19_StringClass;

public class Contains {

	public static void main(String[] args) {

		String str = "Hello Mike, welcome to Cybertek World.";
		System.out.println(str.contains("welc"));
		
		String email = "test@gmail.com";
		System.out.println(email.contains("a"));
		
		String list = "potatoes, tomatoes, eggs";
		
		if (list.contains("eggs")) {
			System.out.println("in the list");
		} else {
			System.out.println("not in the list");
		}
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		System.out.println(word2.contains("c++"));
		
		if (word2.indexOf("c++") !=-1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");

		}

	}

}
