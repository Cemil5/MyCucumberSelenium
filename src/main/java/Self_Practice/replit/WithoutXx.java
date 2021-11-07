package replit;

public class WithoutXx {

	public static void main(String[] args) {

		String word = "xHiX";
		
		if (word.substring(0, 1).equals("x")||word.substring(0, 1).equals("X")) {
			word = word.substring(1,word.length());
		} 
		if (word.substring(word.length()-1, word.length()).equals("x")||word.substring(word.length()-1, word.length()).equals("X")) {
			word = word.substring(0,word.length()-1);
		}
		
		System.out.println(word);
				
	}

}
