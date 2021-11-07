package _NiceToKnow;

public class String_CoverMe {

	public static void main(String[] args) {
		
		System.out.println(coverString("java methods", "me")); // "java [me]thods"
		System.out.println(coverString("Certified Wooden Spoon", "o")); // "Certified W[o][o]den Sp[o][o]n"
		System.out.println(coverString("hello hello", "ello"));// "h[ello] h[ello]"
		System.out.println(coverString("apples", "pears")); // "[apples]"
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
