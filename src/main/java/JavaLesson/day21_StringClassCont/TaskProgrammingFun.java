package day21_StringClassCont;

public class TaskProgrammingFun {

	public static void main(String[] args) {

		String s1 = "Programming is fun";
		
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(2, 3));
		System.out.println(s1.substring(12, s1.length()-4));
		System.out.println(s1.substring(4, 4));
		System.out.println(s1.substring(4, 8));
		
		String chars = "{{}}";
		String word ="AUTOMATION";
		
		String result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result);
		
	}

}
