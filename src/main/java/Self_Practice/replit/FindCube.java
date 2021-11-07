package replit;

import java.util.Scanner;

public class FindCube {
	
	public static void cube() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num*num*num);
	}

	public static void main(String[] args) {

		cube();
	}

}
