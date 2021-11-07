package replit;
import java.util.Scanner;

public class Signum {

	public static void sign(int n){
	    //your code here
	    
	    String m ="";
	    if (n>0){
	      m = "positive"; 
	    } else if (n<0){
	      m = "negative";
	    } else {
	      m ="zero";
	    }
	    //System.out.println("sign("+n+")\t=> "+m);
	    System.out.println(m);
	  }
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
}
}