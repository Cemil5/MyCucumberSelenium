package replit;
/*
 We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

 */
public class Triple {

	public static void main(String[] args) {


		String str = "222abyyycdXXX";
		
		finalTriple(str);
	}
	
	public static void finalTriple (String str) { // metinde ardýþýk olarak ayný harften 3 tane var mý diye kontrol eder
		
		int i =0;
		int triple =0;
		char ch;

		for (;i<str.length()-2;i++) {
			ch = str.charAt(i);
			if (str.charAt(i+1)==ch && str.charAt(i+2)==ch) {
				triple ++;
			}
	  } 
		System.out.println(triple);
		
	}
	
	public static void ThreeLetter(String str) { // metinde geçen bütün harfleri kontrol eder 3 veya fazla varsa tripple olarak sayar
		
	    int count = 0;
		int i =0;
		int j =0;
		int triple =0;
		char ch;

		for (;i<str.length();i++) {
			ch = str.charAt(i);
			count = 1;
			j =i+1;
			do {
			    j = str.indexOf(ch,j);
			    if (j>=0) {
			    	count ++;
			    	j ++;
			    }
			  } while (j>=0);
			if (count >=3) {
				triple++;
			}
	  } 
		System.out.println(triple);
		
	}

}
