package Self_Practice;

import java.util.Scanner;

public class reverseIt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//String str = "abcde";
		String result ="";
		
		if (str.length()==5) {
			for (int i=str.length()-1; i>=0; i--) {
				result += str.charAt(i);
			}
			System.out.println(result);
		} else {
			if (str.length() < 5){
				System.out.println("Too short");
			} else {
			System.out.println("Too long");
			}
		}
	}
	

}
