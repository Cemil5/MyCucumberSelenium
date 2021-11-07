package day05_unary_relationalOperators;

public class Task19_incrementDecrement {
	public static void main(String[] args) {
		
		int a = 50;
		
		int res = --a + a++  + a-- + a++;
//   a in memory = 49 -> 49 -> 50  -> 49 //50
		//	res = 	49 + 49 + 50  + 49 
		
		System.out.println("a = " + a);		//50
		System.out.println("res = " + res);	//197
	}

}
