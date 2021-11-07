package day15_MethodOverloading_Review;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20.5));
	}
	
	public static int sum(int a, int b) {
		return a +b;
	}
	
	public static double sum(int a, double b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
