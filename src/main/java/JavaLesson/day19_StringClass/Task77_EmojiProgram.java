package day19_StringClass;

import java.util.Scanner;

public class Task77_EmojiProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String msg ="invalid";
		
		if (str.length() != 2) {
			return; //stop execution
		}
		
		if	 (str.length() ==2) {
			if (str.charAt(0)==':') {
				switch (str.charAt(1)) {
					case ')' :
						msg = "Smile";
					break;
					case '(' :
						msg = "Sad";
					break;
					case '/' :
						msg = "Upset";
					break;
					case 'p' :
						msg = "Playful";
				} 
			} else if  (str.charAt(0)==';') {
				switch (str) {
					case ";)" :
						msg = "Wink";
					break;
					case ";0" :
						msg = "Surprised";
				} 
			} 
		}
		System.out.println(msg);
	}

}
