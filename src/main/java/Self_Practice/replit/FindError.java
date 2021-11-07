package replit;

public class FindError {

	public static void main(String[] args) {
		
		System.out.println(isError("foo bar"));
		System.out.println(isError("error foo bar"));
	}
	public static boolean isError(String line) {

	    return (line.indexOf("error")==0);



	  }

}
