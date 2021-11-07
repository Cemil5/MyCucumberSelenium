package replit;
import java.util.*;

public class QuizAnswer {
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String a = s.nextLine();
		    
		    //your code here
		    
		    switch (a) {
		    case "a": case "c":
		    	System.out.println(a + " is wrong");
		    	break;
		    case "b":
		    	System.out.println(a + " is correct");
		    	break;
		    default:
		    	System.out.println(a + " is not a valid answer");
		    
		    }

	}

}
