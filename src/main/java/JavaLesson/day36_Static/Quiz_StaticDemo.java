package day36_Static;

public class Quiz_StaticDemo {
	
	Quiz_StaticDemo(){	examName("Constructor");	}
	
	static String n1 = examName("O");
	
	String n2 = examName("test instance variable");
	
	static String n3 = examName("test static variable n3");
	
	{
		n1 += examName("A");
	}
		
	static {
		System.out.println("test_static block");
		n1 += examName("C");
	}
	

	public static void main(String[] args) {
		Quiz_StaticDemo sd = new Quiz_StaticDemo();	
		new Quiz_StaticDemo();	
	}
	
	public static String examName(String s) {
		System.out.println(s);
		return s;
	}
}
