package OCA_Questions.week2;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		
		// Q1
		int[] random = {6, -4, 12, 0, -10};
		int x = 12;
		int y = Arrays.binarySearch(random, x);
	//	System.out.println(y);
		
		// Q2    *******
		String a = "";
		a += 2;
		a += 'c';
		a+= false;
		String b ="2cfalse";
		if( a == b ) System.out.println("1a =="); // 
		

		String c = "2";
		c = "2" + "c" + "false";
		a = c;
		if( a == b ) System.out.println("4. =="); // 4. ==
		if( a.equals( "2cfalse" ) ) System.out.println("4. equals");
		
		a= ""+ 2 + 'c' + false + "";
		if( a == b ) System.out.println("5. =="); // 5. ==
		
		a="2cfalse" ;
		if( a == b ) System.out.println("first =="); // first ==

		a= "2c" + "false";
		if( a == b ) System.out.println("second =="); // second ==
		
		a= "2c" + false;
		if( a == b ) System.out.println("third =="); // third ==
		

		if( a.equals( "2cfalse" ) ) System.out.println("equals");
		
		// Q3   
		String s1 = "buy";
		s1.toUpperCase();
		s1.trim();
		s1.substring(1,3);
		s1 += " apple";
		System.out.println( s1.length() );	//9
		
		// Q6    
		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = ""+numFish+1; // without "";  Type mismatch: cannot convert from int to String
		System.out.println( anotherFish + " " + fishType );
		System.out.println( numFish + " " + 1 );
		
		
		//Q7
		String s = "Hello";
		String t = new String(s);
		if("Hello".equals(s)) System.out.println("one");	// one
		if( t==s ) System.out.println("two");				// 
		if(t.equals(s)) System.out.println("three");		//three
		if( "Hello" == s ) System.out.println("four");		//four
		if( "Hello" == t ) System.out.println("five");		//
		
		//Q8
		byte a1 =40, b1 = 50;
		byte sum = (byte) (a1+b1); // (byte) a1+b1; olursa, b1'i int kabul ettiði için hata veriyor.
		System.out.println(sum);
		
		
	}

}
