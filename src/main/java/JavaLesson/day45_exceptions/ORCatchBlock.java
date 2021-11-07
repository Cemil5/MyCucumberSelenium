package day45_exceptions;

import java.io.IOException;
import java.util.InputMismatchException;

public class ORCatchBlock {
	
	static String str = null;


	public static void main(String[] args) {
		
		
		try {
			System.err.println(str.toUpperCase());
		} catch(IllegalArgumentException | NullPointerException | InputMismatchException e) {
			// Exception types can not be sub-parent types
			e.printStackTrace();
		}
		
		
	}

}
