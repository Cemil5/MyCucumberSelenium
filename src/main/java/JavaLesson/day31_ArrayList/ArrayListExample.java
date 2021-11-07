package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> lang = new ArrayList<>();
		
		
		lang.add("English");
		lang.add("German");
		lang.add("Japanese");
		lang.add("French");
		lang.add("Russian");
		
		System.out.println(lang.size());	// 5
		
		System.out.println(lang.get(0));	//English
		System.out.println(lang.get(1));	//German
		System.out.println(lang.get(2));	//Japanese
		
		System.out.println(lang.toString()); // [English, German, Japanese, French, Russian]
		
		lang.add("Italian");
		System.out.println(lang.toString());
		System.out.println(lang.size());		// 6

		
		lang.remove(0);
		System.out.println(lang.toString());

	}

}
