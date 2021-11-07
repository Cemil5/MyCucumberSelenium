package day05_unary_relationalOperators;

public class Task20_inc {
	public static void main(String[] args) {
		
		int a = 1;
		int res = -a--  +  a++  /  -a-- * --a;
	//a in memory: 1 ->   0 -> 1  -> 0 -> -1
	//res		   -1 +    0   /  -1     * -1		
	//res		   -1 +    0  * -1 => -1
		System.out.println("a = " + a);
		System.out.println("res = " + res);
	}

}
