package a_live_review.week05_03_07_2021;

public class VariableUnary {
	public static void main(String[] args) {
		
		int a = 5;
	    int b = a++ + a-- + a * 2 + a + ++a;
	    // a => 5      6    5       5   6
	    // b =	5  +   6  + 5 * 2 + 5 + 6
		System.out.println(a + "  " +b);
		
		System.out.println("**************");
		
		
		int x = 200;
		int y = -x++ + -(--x) * x-- %2 + x;
		// x =>  200	200   200 %2 + 199
		// y => -200 +  200 * 200 %2 + 199
		
		System.out.println(x + "   " + y);
		
		System.out.println("**** logical ******");
		
		int one = 50;
		int two = 0;
		System.out.println(one > two);
		System.out.println(one > two || one/two ==0); // result is true
	//	System.out.println(one > two | one/two ==0); // causes exception - error

		
	}

}
