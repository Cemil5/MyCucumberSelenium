package replit;

import java.util.*;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		String message = "";
		
		if (num>0) {
			message = "positive";
		} else if (num<0) {
			message = "negative";

		} else {
			message = "zero";
		}
		System.out.println("num = " + num + "\n"+message);
		
	}

}
