package day06_logicalOperators;

public class Task3 {
	public static void main(String[] args) {
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
						//   F || T && F
		
		System.out.println(res);
		
		System.out.println("***********");
		
		boolean x = true, z = true;
		int y = 20;
	//	x == (y!=10) && (z == false);
		x = true && (z == false);

		System.out.println(x);
		
		
	}

}
