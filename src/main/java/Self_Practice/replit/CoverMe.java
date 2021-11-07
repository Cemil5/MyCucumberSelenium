package replit;

public class CoverMe {

	public static void main(String[] args) {
		
		System.out.println(coverString("java methods", "me").equals("java [me]thods"));  // test case examples validation
		System.out.println(coverString("Certified Wooden Spoon", "o").equals("Certified W[o][o]den Sp[o][o]n"));
		System.out.println(coverString("hello hello", "ello").equals("h[ello] h[ello]"));
		System.out.println(coverString("apples", "pears").equals("[apples]"));
	}

	
	 public static String coverString(String main, String coverME) {
		    // your code here
		 String result="";
		 int i = 0;
		 do {
			 i = main.indexOf(coverME);
			 if (i>=0) {
				 result += main.substring(0,i) + "["+coverME+"]";
				 i += coverME.length();
				 main = main.substring(i);
			 } else if (result.isEmpty()) {
				 result = "["+main+"]";
			 } else {
				 result += main;
			 }
		 } while (i>0);
		 return result;
	}
}
