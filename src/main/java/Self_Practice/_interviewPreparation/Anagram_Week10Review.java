package _interviewPreparation;

import java.util.Arrays;

public class Anagram_Week10Review {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";
		
		str1 = "triangel";
		str2 = "integral";
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean isAnagram = Arrays.equals(c1, c2);
		System.out.println(isAnagram);
		
		//

		boolean b =true;
		
		for (int i=0; i<c1.length; i++) {
			if (c1[i] != c2[i]) {
				b =false;
				break;
			}
		}
		System.out.println(b);
		
		//
		boolean b1 =false;
		for (int i=0; i<c1.length; i++) {
			for (int j=0; j<c2.length;j++) {
				if (c1[i] == c2[j]){
					b1 = true;
					continue;
				}				
			}
			if (b1==false) {
				break;
			}
		}
		System.out.println(b1);
	}

}
