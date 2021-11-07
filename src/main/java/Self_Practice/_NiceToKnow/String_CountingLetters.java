package _NiceToKnow;

public class String_CountingLetters {

	public static void main(String[] args) {

		System.out.println(countLetters("aaabbcccc")); //3a2b4c
		System.out.println(countLetters("opendoor")); //3o1p1e1n1d1r

		
	}

	  public static String countLetters(String str){
		  String result ="";
		  do {
			  String ch = str.charAt(0)+"";
			  str = str.replaceFirst(ch, "");
			  int count =1;
			  int i=0;
			 // i = str.length();
			  do {
				  i = str.indexOf(ch);
				  if (i>=0) {
					  count ++;
					  str=str.replaceFirst(ch, "");
				  } 
			  } while (i>=0);
			  result += ""+ count + ch;
		   } while (!str.isEmpty());
		  
		  return result;
		  
	  }
	  
	  public void template(String str) {
		  
	  }

}
