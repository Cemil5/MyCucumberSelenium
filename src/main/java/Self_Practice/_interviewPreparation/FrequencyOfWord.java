package _interviewPreparation;

public class FrequencyOfWord {
	/*
write a program that can return the frequency of the a word Java from the sentence 
        Ex:
            sentence = "Java Java";  
            output:
                2
	 */

	public static void main(String[] args) {
		
		String sentence = "Java JAva JAVA"; 
		String word = "Jav";
		
		System.out.println("-------first option for (Muhtar)---------");

		int count =0;
		
		for (int i=0; i<=sentence.length()-word.length(); i++){
			String str =sentence.substring(i, i+word.length());
			if (str.equalsIgnoreCase(word)) {
				count ++;
			}
		}
		System.out.println(count);
		
		System.out.println("-------second option Do While---------");
		
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		
		int index = 0;
		int occurrence = 0;
		do {	
			index = sentence.indexOf(word, index);
			if (index !=-1) {
				occurrence++;
				index ++;
			}
		} while (index !=-1);
		System.out.println( occurrence );
		

		System.out.println("-------third option While---------");
		
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
