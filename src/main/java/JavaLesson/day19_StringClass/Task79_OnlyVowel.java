package day19_StringClass;

public class Task79_OnlyVowel {

	public static void main(String[] args) {

		String word = "CybertekSchoolappledd";
		String msg ="";
				
		for (int i=0; i<word.length();i++) {
			char letter= word.charAt(i);
			if (letter=='a' || letter=='e' || letter =='o' || letter=='i' || letter=='u') {
				msg += letter;
				if (i!=word.length()-1) {
					msg += ",";
				}
			}
		}
		System.out.println(msg);
	}

}
