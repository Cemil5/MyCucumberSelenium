package day13_Method;

public class LoopCallMethod {

	public static void main(String[] args) {

		System.out.println("hello from the main method");
		
		for (int i=0; i<5;i++) {
			displayMessage();
			System.out.println("back in the method");
		}
	}
public static void displayMessage() {
	System.out.println("hello from displayMessage method");
}
}
