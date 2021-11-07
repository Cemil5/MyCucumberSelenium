package day31_ArrayList;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("j5");
	
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1.toString());	// [java, j5]
		System.out.println(l2.toString());	// [C#, C++]
	
		l2.addAll(l1);
		System.out.println(l2.toString());	// [C#, C++, java, j5]
		System.out.println(l1);				// [java, j5]
		
		
		
		
	}

}
