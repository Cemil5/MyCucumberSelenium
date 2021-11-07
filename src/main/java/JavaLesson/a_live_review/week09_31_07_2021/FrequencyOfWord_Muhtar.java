package a_live_review.week09_31_07_2021;

public class FrequencyOfWord_Muhtar {
	/*
write a program that can return the frequency of the a word Java from the sentence    
	 */

	public static void main(String[] args) {
		
		String sentence = "Java JAva JAVA"; 
		String word = "Java";
		int count =0;
		
		for (int i=0; i<=sentence.length()-word.length(); i++){
			String str =sentence.substring(i, i+word.length());
			if (str.equalsIgnoreCase(word)) {
				count ++;
			}
		}
		System.out.println(count);

		System.out.println("-------second option While---------");
		
		count =0;
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		while (sentence.contains(word)) {			
			count ++;
			sentence = sentence.replaceFirst(word, "");
		}
		System.out.println(count);
	}

}
