package labs.Lab3;

public class Q2 {

	public static void main(String[] args) {
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));

		
	}
	
	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

}
