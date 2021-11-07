package a_live_review.week07_17_07_2021;

public class MethodExamples {
	public static void helloWorld() {
		System.out.println("Hello World");
		System.out.println(helloWorld2());
	}
	
	public static String helloWorld2() {
		String s = "Hello World2";
		return s;
	}
	
	public static void main(String[] args) {
		helloWorld();
		printMessage("week 7");
	}
	
	public static void printMessage(String msg) {
		System.out.println(msg + " "+ msg);
	}

}
