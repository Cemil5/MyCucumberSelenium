package day45_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			//return;
			//System.exit(0);
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("bye");
	}

}
