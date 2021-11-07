package basics;

public class String_equals {

	public static void main(String[] args) {

		String s1 = "I love";
		s1 += " Java";
		String s2 = "I";
		s2 += " love Java";
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println("-------------------");
		
		s1 = "I love Java";
		s2 = "I love Java";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); //true
		
	}

}
