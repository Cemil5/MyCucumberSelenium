package replit;

public class WordCount {

	public static void main(String[] args) {
		
		System.out.println(wordCount("on aü ae ae ae aa"));
		
	}

	
	 public static int wordCount(String words) {
		    // your code
		 int count =1;
		 int ln = words.length();
		 
		 for (int i =0; i<ln && words.indexOf(" ",i)>0;i++) {
			 if (words.indexOf(" ", i)>0) {
				 count++;
				 i = words.indexOf(" ",i);
			 }
		 }
		 	
		 	
		  return count;
		  }
}
