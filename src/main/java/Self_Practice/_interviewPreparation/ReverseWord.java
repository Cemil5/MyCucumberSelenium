package Self_Practice._interviewPreparation;

public class ReverseWord {

	public static void main(String[] args) {

		System.out.println(reverseWord("foo").equalsIgnoreCase("oof") ? "PASS" : "Fail");  //
		System.out.println(reverseWord("student"));
		
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
