package replit;

public class CountJava {

	public static void main(String[] args) {

		String word = "javaxjavaapplepearjavaegjavag";
		
		int count =0;
		int i =0;
		do {
		    i = word.indexOf("java",i);
		    if (i>=0) {
		    	count ++;
		    	i +=4;
		    }
		  } while (i>=0);
		System.out.println(count);
		
	}

}
