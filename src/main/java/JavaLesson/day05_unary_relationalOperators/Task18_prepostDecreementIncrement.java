package day05_unary_relationalOperators;

public class Task18_prepostDecreementIncrement {
	public static void main(String[] args) {
		
		int x = 2;
		int y = x++; // y = 2, x = 2
		y = x; 		 // y = 3, x = 3
		
				
		System.out.println(x); 	//3
		System.out.println(y);	//3
		
		x = 2;
		System.out.println(x++); 	//2
		System.out.println(x); 		//3
		
		x = 2;
		System.out.println(--x); 	//1
		
		x = 8;
		y = x--;
		System.out.println(y); 		//8
		
		System.out.println(x = x--);
		
		
	}

}
