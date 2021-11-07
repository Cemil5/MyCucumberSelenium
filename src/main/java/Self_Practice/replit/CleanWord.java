package replit;
/*
This method accept two strings (text and badWord) and returns a string.
The method will take out all the occurrences of badWord in the text.
 */
public class CleanWord {

	public static void main(String[] args) {
		
		System.out.println(clean("foo bar","foo"));
		System.out.println(clean("one two three","two"));
		System.out.println(clean("he said bla bla bla","bla"));

	}
	
	
	 public static String clean (String text , String badWord) {
		 
		 text = text.replace(badWord, "");
		 text = text.trim();
		 text = text.replace("  ", " ");
	     
		 return text;
	 }
	
	 public static String clean0 (String text , String badWord) {  // old version
		 String result ="";	
		 int lengthBadWord = badWord.length();
	     int i; 
	     
	     do {
	    	 i = text.indexOf(badWord);
	    	 if (i>0) {
		    	 result += text.substring(0, i-1);
		    	 i +=lengthBadWord;
		    	 text = text.substring(i);
	    	 } else if (i==0) {
	    		 i = lengthBadWord+1;
	    		 text = text.substring(i); 	 
	    	 } else {
	    		 result += text;
	    	 }
	     } while (i>0);
	     
		 return result;
	 }
	 
}
