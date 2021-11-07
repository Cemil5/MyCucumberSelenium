package replit;

public class CountHi {

	public static void main(String[] args) {

		String str = "hi java low hihi work hard hi code java hi";
		
		int count =0;
		int i =0;
		do {
		    i = str.indexOf("hi",i);
		    if (i>=0) {
		    	count ++;
		    	i +=2;
		    }
		  } while (i>=0);
		System.out.println(count);
	}

}
