package day05_unary_relationalOperators;

public class MixedInteger {
	public static void main(String[] args) {
		
		byte i1 = 5;
		byte i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 = i1 + f1;
		double res3 = i2 + d1;
		
		short s1 = 10;
		short s2 = 20;
		
		int s3 = s1 + s2;
		short s4 = (short)(s1 + s2);

		byte b1 = 20;
		byte b2 = 2;
		byte b3 = (byte) (b1 * b2);
		
		int b4 = 126;
		int b5 = 1;
		
		byte b6 = (byte)(b1 + b2); // casting required
		byte res4 = 126 + 1; //no casting is required
		
		
	}

}
