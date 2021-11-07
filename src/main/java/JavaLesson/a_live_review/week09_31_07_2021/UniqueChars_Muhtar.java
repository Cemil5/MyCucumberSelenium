package a_live_review.week09_31_07_2021;
/*
 write a program that can return the unique characters from a string
        ex:  "aabcccd";

        output:
            bd
 */
public class UniqueChars_Muhtar {

	public static void main(String[] args) {

		String str = "aabccdeefghhi";
		String result = ""; // bd

		for (int i = 0; i < str.length(); i++) {		//option2
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
		System.out.println(result);
	}

	public static void option1 (String str) {
		String result = ""; // bd
		for (int j = 0; j < str.length();j++) {
			char ch = str.charAt(j);
			int frequency = 0;
			
			for (int i=0; i< str.length(); i++) {
				if (str.charAt(i) == ch) {
					frequency ++;
				}
			}
			if (frequency==2) {
				result += ""+ch;
			}
		}
		System.out.println(result);
	}
	
	
}
