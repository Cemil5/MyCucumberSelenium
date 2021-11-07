package replit.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAllWord {

	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
		removeAll(wordList,"hi");
	
		ArrayList<String> wordList1 = new ArrayList<>();
		wordList1.add("a");
		wordList1.add("ds");
		wordList1.add("a");
		wordList1.add("b");
		wordList1.add("c");
		wordList1.add("a");
		wordList1.add("d");
		removeAll(wordList1,"a");
	
	}
	
	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
		ArrayList<String> temp = new ArrayList<>();
		temp.add(targetWord);
	    wordList.removeAll(temp);
	    System.out.println(wordList) ;
	    return wordList;
	  }
	
}
