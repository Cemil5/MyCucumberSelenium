package groupStudy;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		
		char[] c = new char[2];
		int length = c.length;
		
		ArrayList<String> list = new ArrayList<>();
	//	list.add(7);
		
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		System.out.println(ages);
		for(Integer age:ages) System.out.println(age);
		
		ArrayList<String> one = new ArrayList<>();
		one.add("abc");
		ArrayList<String> two = new ArrayList<>();
		two.add("abc");
		if (one.equals(two)) {
			System.out.println(true);
		}
	//	methodA();
		methodA(true, true, true);
		methodA(true, new boolean[2]);
		System.out.println(methodA(true, new boolean[4]));	
	}
	
	public static int methodA(boolean b, boolean... b2) {
		return b2.length;
	}
	
	
}
