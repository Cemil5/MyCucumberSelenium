package labs.Lab3;

public class Q13 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The").equals("TThhee"));
		System.out.println(doubleChar("AAbb").equals("AAAAbbbb"));
		System.out.println(doubleChar("Hi-There").equals("HHii--TThheerree"));
		
	}
	
	public static String doubleChar(String str) {
		String result ="";
		
		for (int i=0; i<str.length();i++) {
			result += "" + str.charAt(i) + str.charAt(i);
		}
		//System.out.println(result);
		
		return result;
	}

}
