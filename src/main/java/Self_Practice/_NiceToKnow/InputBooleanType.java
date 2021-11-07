package _NiceToKnow;

import java.util.Scanner;

public class InputBooleanType {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean b = Boolean.parseBoolean(str);
		
		boolean b1 = s.next().equals("yes");
		
		System.out.println(str + " " + b + " " + b1);
		
	}

}
