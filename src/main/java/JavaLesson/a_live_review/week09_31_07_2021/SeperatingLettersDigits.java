package a_live_review.week09_31_07_2021;

public class SeperatingLettersDigits {

	public static void main(String[] args) {

		String str = "A1B2C3"; // get the sum of digits  1+2+3=6
		int sum =0;
		for (int i=0; i<= str.length()-1; i++) { //i represents index numbers of str
			char ch = str.charAt(i);
			if (ch>=48 && ch<=57) { //'1' '2' '3' '0' & '9' also can be used instead of ASCII table
				//sum += ch - 48;   // 49-48, 50-48, 51-48  converting the digit characters to number
				sum += Integer.parseInt(String.valueOf(ch));
			}
		}
		System.out.println(sum);
		
		System.out.println("---------------------------------------");
		
		String input = "mnj@#  !!kl12345ABCD";
		String letters = "";	 // mnjklABCD
		String digits = "";	 //  12345
		String specialChars = ""; 
		
		for (int i=0; i<= input.length()-1; i++) {
			char ch = input.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
				letters += ch;
			} else if (ch >= '0' && ch <= '9'){
				digits +=ch;
			} else {
				specialChars += ch;
			}
		}
		
		System.out.println("letters: " + letters);				// letters: mnjklABCD
		System.out.println("digits: " + digits);				// digits: 12345
		System.out.println("specialChars: " + specialChars);	// specialChars: @#  !!

	}

}
