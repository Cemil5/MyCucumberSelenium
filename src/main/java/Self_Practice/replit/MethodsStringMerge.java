package replit;

public class MethodsStringMerge {

	public static void main(String[] args) {
		System.out.println(mergeStrings("1234", "abcde"));
	}

	public static String mergeStrings(String one, String two) {
	    
	    String result ="";
	    int l1 = one.length();
	    int l2 = two.length();
	    int i=0;
	    for (; i<l1 && i<l2; i++) {
	    	result += one.charAt(i);
	    	result += two.charAt(i);
	    }
	    if (l1>l2) {
	    	result += one.substring(i);
	    } else if (l1<l2){
	    	result += two.substring(i);
	    }
	    
	    return result;
	  }
}
