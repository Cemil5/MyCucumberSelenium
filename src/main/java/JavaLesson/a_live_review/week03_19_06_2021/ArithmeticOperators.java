package a_live_review.week03_19_06_2021;

public class ArithmeticOperators {

	public static void main(String[] args) {

		System.out.println("10 / 3 = " + 10/3);  //3
		System.out.println("10 / 3 = " + 10/3.0); // 3.333
		System.out.println("10 / 3 = " + (10/(int)3.0)); //3 
		System.out.println("10 / 3 = " + (int)(10/3.0)); //3 
		System.out.println("10 / 3 = " + (double)(10/3)); //3.0
		System.out.println("10 / 3 = " + (double)(10)/3); //3.333
		System.out.println("10 / 3 = " + (int)(10/(double)3)); //3
	    float result;
	    result = 10/3; // 3  int / int -> int
	    System.out.println(result);
	    float result2;
	    result2 = 10/3f;
	    System.out.println(result2); // 3.333
		
		byte resultOne = (byte)(50 * 4); // -56
		System.out.println(resultOne);
		 
		int $_;
		//int _identi#ficador;
	    int result3 = 10 % 2 + -4 / 2 * 5;
	    System.out.println(result3);  // -10 left to right
		
        result3 = 4 * 2 - 4 + 3 * 4; // left to right
        System.out.println(result3);
        
  
        
        
        
	}

}
