package _interviewPreparation;

import java.util.Arrays;

public class Reversing_Names_Sentence_Word {

	public static void main(String[] args) {
		
		System.out.println("----------- Array reversing Names - Muhtar -------------- ");

		String[] names = {"Selda", "Zeynep", "Selcuk", "Ali", "Niyazi"};
		System.out.println(Arrays.toString(reverseNames(names)));	
		// first sorting and then reversing names, case sensitive
		
		System.out.println("----------- Array reversing Sentence - Muhtar -------------- ");
		String str = "I love Java";  
		System.out.println(reverseSentence(str));	// sentence reverse : java love I
		
		System.out.println("----------- reverse word -------------- ");
		System.out.println("foo  " + reverseWord("foo"));  			//  "oof"
		System.out.println("student  " + reverseWord("student"));	// tneduts
	}
	
	public static String[] reverseNames(String[] names){
		
		Arrays.sort(names); // ascending using ASCII table
		String[] namesDesc = new String[names.length];
		
		for (int i=names.length-1, j=0; i>=0;i--, j++) {
			namesDesc[j] = names[i];
		}
		System.out.println(Arrays.toString( names ));
		return namesDesc;
	}
	
	public static String reverseSentence(String str){
	
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		String reverse = "";
		String space = "";
		
		for (int i = words.length-1; i>=0;i--) {
			reverse += space + words[i];
			space = " ";
		}	
		return reverse;
	}
	
	
	public static String reverseWord(String input){
		String result="";
		int ln = input.length();
		
		for (int i=ln-1; i>=0;i--) {
			result += input.charAt(i);
		}
		return result;
	}
	
}
