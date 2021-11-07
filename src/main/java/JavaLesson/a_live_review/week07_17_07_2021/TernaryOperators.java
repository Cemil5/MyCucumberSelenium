package a_live_review.week07_17_07_2021;

public class TernaryOperators {

	public static void main(String[] args) {

		String res = 10 % 2 == 0 ? "Even" : "Odd"; // even
		System.out.println("result " + res);
		
		int n1 = 20, n2 = 100;
		int max = n1>n2 ? n1 : n2; //100
		System.out.println(max);
		
		int numOne = 40;
		int numTwo = 40;
		int numThree = 100;
		
		System.out.println(numOne + numTwo + numThree == 180 ? "Valid Triangle" : "Invalid Triangle");
		
		
	}

}
