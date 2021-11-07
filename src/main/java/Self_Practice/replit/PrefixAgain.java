package replit;

public class PrefixAgain {

	public static void main(String[] args) {

		 String str = "abXYabc";
		 int n = 1;
		 
		 String prefix = str.substring(0, n);
		int m =str.indexOf(prefix, n);
		
		System.out.println(m > 0 ? true : false);
	}

}
