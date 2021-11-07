package a_live_review.week08_24_07_2021;

public class Calc {

	public static void main(String[] args) {
		System.out.println(add (1,2));
		System.out.println(add (1f,2));
		System.out.println(add (1d,2));


	}
	
	public static int add (int one, int two) {
		return one + two;
	}
	
	public static float add (float one, float two) {
		return one + two + 1;
	}

	public static double add (double one, double two) {
		return one + two + 2;
	}

}
