package replit;

public class ReverseWord {

	public static void main(String[] args) {

		System.out.println(reverse("foo"));  // "oof"
		System.out.println(reverse("student"));
		
	}

	public static String reverse(String input){
		String result="";
		int ln = input.length();
		
		for (int i=ln-1; i>=0;i--) {
			result += input.charAt(i);
		}
		
		return result;
	}
	
}
