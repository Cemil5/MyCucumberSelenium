package replit;

public class RepeatSeparatorCount {

	public static void main(String[] args) {

		String word ="Word";
		String separator = "X";
		int count = 5;

		String result = word;
		 
		for (int i=2; i<=count; i++) {
			result += separator+word;
		}
		 
		System.out.println(result);
		
	}

}
